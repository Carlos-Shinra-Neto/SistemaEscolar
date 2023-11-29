package main.cargo;

public abstract class Cargo {
    private String nome;
    private double salarioBase;
    protected String beneficios;


    public Cargo() {
        this.nome = "Desenvolvedor";
        this.salarioBase = 50;
        this.beneficios = "vale alimentação";
    }

    public String getNome() {
        return nome;
    }


    public double getSalarioBase(int i) {
        if (i <= 3) {
            return salarioBase;
        } else {
            System.out.println("Você não tem acesso a ver o sário base");
        }
        return 0;
    }

    public String getBeneficios() {
        return this.beneficios;
    }

    private String setNome() {
        return this.nome;
    }


    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }


    public String changeNome(String nome, int i) {
        if (i == 1) {
            System.out.println("Alterou o cargo");
            return this.nome = nome;
        } else {
            System.out.println("Não alterou o cargo");
            return this.nome;
        }
    }

    public abstract String beneficios();

}