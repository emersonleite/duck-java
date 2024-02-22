package com.emerson.leite.courses.cod3r.java_completo.fundamentos.estrututuras_de_controle;

public class For1 {

    public static void main(String[] args) {

        for (int contador = 0; contador <= 5; contador++) {
            System.out.println("Bom dia Zé " + contador);
        }

        /* Outra forma de fazer o for, mas através de um array */
        int[] idades = { 32, 33, 35 };

        for (int idade : idades) {
            System.out.println(idade);
        }

    }
}
