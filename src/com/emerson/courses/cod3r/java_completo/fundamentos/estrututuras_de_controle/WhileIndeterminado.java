package com.emerson.courses.cod3r.java_completo.fundamentos.estrututuras_de_controle;

import java.util.Scanner;

public class WhileIndeterminado {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String valor = "";

        while (!valor.equalsIgnoreCase("sair")) {
            System.out.print("Você diz: ");
            valor = entrada.nextLine();
        }

        System.out.println("Saiu!");
        entrada.close();
    }
}
