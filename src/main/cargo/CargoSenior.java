package main.cargo;

public class CargoSenior extends Cargo {
    private int nivel;
    private String senior;
    public CargoSenior(){
        super();
        this.nivel = 2;
        this.senior = " senior";
    }
    public int getNivel(){
        return nivel;
    }

    @Override
    public String getNome(){
        return super.getNome() + senior;
    }
    @Override
    public double getSalarioBase(int i) {
        if (i == 3) {
            return super.getSalarioBase(i) + (20 * nivel) + 10;
        } else {
            System.out.println("Não alterou o Salario");
            return 0;
        }
    }

    @Override
    public String beneficios(){
        return super.getBeneficios();
    }
}
