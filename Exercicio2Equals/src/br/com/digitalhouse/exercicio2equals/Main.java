package br.com.digitalhouse.exercicio2equals;

public class Main {

    public static void main(String[] args) {

        Coca coca1 = new Coca (20,4.50);
        Coca coca2 = new Coca (20, 5.50);

        if(coca1.equals(coca2)){
            System.out.println("Objetos iguais");
        }else{
            System.out.println("Objetos diferentes");
        }
    }

}
