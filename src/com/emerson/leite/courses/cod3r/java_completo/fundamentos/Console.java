package com.emerson.leite.courses.cod3r.java_completo.fundamentos;

import java.util.Scanner;

public class Console {

    public static void main(String[] args) {

        // Não pula linha
        System.out.print("Bom");
        System.out.print(" dia\n");

        // Pula linha
        System.out.println("Bom");
        System.out.println("dia");

        // String formatada
        System.out.printf("Megasena %d %d %d %d %d %n \n", 1, 5, 2, 1, 4);

        System.out.printf("Salário: %.1f \n", 500.85);

        System.out.printf("Nome: %s \n", "Emerson");

        // Scanner para leituras de dados
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.println("\n\nNome: " + nome + " " + sobrenome);
        System.out.println("tem " + idade + " anos");

        // Fechando o scanner
        entrada.close();

    }

}
