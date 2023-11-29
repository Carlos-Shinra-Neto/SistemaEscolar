package main.cargo;

public class CargoPleno extends Cargo{
    private int nivel;
    private String pleno;

    public CargoPleno(){
        super();
        this.nivel = 2;
        this.pleno = " pleno";

    }
    public int getNivel(){
        return nivel;
    }

    @Override
    public String getNome(){
        return super.getNome() + pleno;
    }

    @Override
    public double getSalarioBase(int i) {
        if (i == 2) {
            return super.getSalarioBase(i) + (10 * nivel);
        } else {
            System.out.println("Não alterou o Salario");
            return 0;
        }
    }
    @Override
    public String beneficios(){
        return super.getBeneficios() + " vale transporte";
    }

}
