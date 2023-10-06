package com.emerson.courses.softblue.fundamentos_java.p10_colecao_de_dados;

public class Teste {

  public static void main(String[] args) {

    int[] notas = new int[5];

    System.out.println(notas);

    notas[3] = 8;

    for (int i : notas) {
      System.out.println(i);
    }

  }

}
