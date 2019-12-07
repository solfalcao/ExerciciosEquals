package br.com.digitalhouse.exercicio5equals;

import java.util.Objects;

public class Funcionario {

    private String nome;
    private Integer numeroDeRegistro;

    public Funcionario(String nome, Integer numeroDeRegistro) {
        this.nome = nome;
        this.numeroDeRegistro = numeroDeRegistro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionario that = (Funcionario) o;
        return Objects.equals(numeroDeRegistro, that.numeroDeRegistro);
    }


}
