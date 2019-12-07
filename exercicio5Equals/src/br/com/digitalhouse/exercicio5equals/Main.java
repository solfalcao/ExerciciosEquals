package br.com.digitalhouse.exercicio5equals;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Funcionario> listaFuncionarios = new ArrayList<>();

        Funcionario funcionario1 = new Funcionario("Adriano", 2001);
        Funcionario funcionario2 = new Funcionario("Paulo", 2002);
        Funcionario funcionario3 = new Funcionario("Estevão", 2003);
        Funcionario funcionario4 = new Funcionario("Adriano", 2004);
        Funcionario funcionario5 = new Funcionario("Mariana", 2005);

        listaFuncionarios.add(funcionario1);
        listaFuncionarios.add(funcionario5);
        listaFuncionarios.add(funcionario2);
        listaFuncionarios.add(funcionario4);

        for (int i = 0; i < listaFuncionarios.size(); i++) {
            if (listaFuncionarios.contains(funcionario1)) {
                System.out.println("Funcionário existente.");
            } else {
                System.out.println("Pode incluir na folha de pagamento");
            }
        }


    }
}
