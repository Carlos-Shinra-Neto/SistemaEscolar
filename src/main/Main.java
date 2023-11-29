package main;


import main.cargo.Cargo;
import main.cargo.CargoJunior;
import main.cargo.CargoPleno;
import main.cargo.CargoSenior;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Cargo> listaCargos = new ArrayList<>();

        listaCargos.add(new CargoJunior());
        listaCargos.add(new CargoPleno());
        listaCargos.add(new CargoSenior());


        int codigoSalario = 1;
        for (Cargo cargo : listaCargos) {
            exibirInformacoes(cargo, codigoSalario++);
        }
    }

    private static void exibirInformacoes(Cargo cargo, int codigoSalario) {
        System.out.println("Nome do Cargo: " + cargo.getNome());
        System.out.println("Salário Base: " + cargo.getSalarioBase(codigoSalario));
        System.out.println("Benefício: " + cargo.beneficios());
        System.out.println("-----------------------------------------------------");
    }
}
