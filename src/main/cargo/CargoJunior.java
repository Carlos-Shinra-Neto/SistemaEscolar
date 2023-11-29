package main.cargo;

public class CargoJunior extends Cargo{
    private String junior;
    private int nivel;

    public CargoJunior(){
        super();
        this.nivel = 1;
        this.junior = " Junior";
    }

    public int getNivel(){
        return nivel;
    }

    @Override
    public String getNome(){
        return super.getNome() + junior;
    }

    @Override
    public double getSalarioBase(int i){
        if (i == 1){
            return super.getSalarioBase(i) - ( 10 * nivel);
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
