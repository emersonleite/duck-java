package com.emerson.leite.courses.cod3r.java_completo.fundamentos.estrututuras_de_controle;

import java.util.Scanner;

public class If {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Entre com a média: ");
        double media = entrada.nextDouble();

        // Sem colchetes para uma linha
        // if(media >= 7)
        // System.out.println("Aprovado");

        if (media >= 7) {
            System.out.println("Aprovado");
            System.out.println("Parabéns!");
        }

        entrada.close();
    }

}
