package br.com.digitalhouse.exercicio2equals;

import java.util.Objects;

public class Coca {

    private Integer tamanho;
    private Double preco;

    public Coca(Integer tamanho, Double preco) {
        this.tamanho = tamanho;
        this.preco = preco;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coca coca = (Coca) o;
        return Objects.equals(tamanho, coca.tamanho) &&
                Objects.equals(preco, coca.preco);
    }

    @Override
    public int hashCode() {

        return Objects.hash(tamanho, preco);
    }

    //    @Override
//    public boolean equals(Object novaCoca) {
//        if (this == novaCoca) return true;
//        if (!(novaCoca instanceof Coca)) return false;
//        Coca coca = (Coca) novaCoca;
//        return Objects.equals(tamanho, ((Coca) novaCoca).tamanho);
//    }

    //    public boolean equals(Object novoObjeto) {
////        if (this == novoObjeto) {
////            return true;
////        }
////
////        if (!(novoObjeto instanceof Pessoa)) {
////            return false;
////        }
////
////        Pessoa pessoa = (Pessoa) novoObjeto;
////        return this.rg == pessoa.rg;
//
//
//    }
}
