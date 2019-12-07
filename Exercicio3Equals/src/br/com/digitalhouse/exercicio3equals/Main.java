package br.com.digitalhouse.exercicio3equals;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        List<Aluno> nomeAlunos = new ArrayList<>();

        Aluno aluno1 = new Aluno("Pedro", 0001);
        Aluno aluno2 = new Aluno("Estela", 0003);
        Aluno aluno3 = new Aluno("Marcio", 0004);
        Aluno aluno4 = new Aluno("Fabio", 0005);
        Aluno aluno5 = new Aluno("Ana", 0006);
        Aluno aluno6 = new Aluno("Renato", 0006);

        nomeAlunos.add(aluno1);
        nomeAlunos.add(aluno2);
        nomeAlunos.add(aluno4);
        nomeAlunos.add(aluno5);
        nomeAlunos.add(aluno6);


        for (int i = 0; i < nomeAlunos.size(); i++) {
            if (nomeAlunos.contains(aluno6)) {
                System.out.println("Aluno já existente. Não inscrever novamente");
            }else{
                System.out.println("Inscreva o aluno");
            }

        }
    }
}
