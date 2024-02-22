package com.emerson.leite.courses.isidro.estrutura_de_dados;

import java.util.Scanner;

public class Stack_ConversorDecimalToBinary {

  public static void main(String[] args) {

    /* Lendo o valor */
    Scanner in = new Scanner(System.in);
    System.out.printf("Entre com o valor inteiro:  ");
    int number = in.nextInt();
    in.close();

    Stack p = new Stack(100);
    int rest;

    while (number != 0) {
      rest = number % 2;
      p.push(rest);
      number = number / 2;
    }

    while (!p.isEmpty()) {
      rest = p.pop();
      System.out.println(rest);
    }

    System.out.println("\nFim do programa");

  }
}
