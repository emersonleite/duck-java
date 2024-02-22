package com.emerson.leite.courses.cod3r.java_completo.fundamentos.estrututuras_de_controle;

public class For3 {

  public static void main(String[] args) {

    /* i está no escopo de for */
    for (int i = 0; i < 10; i++) {
      System.out.println(i);
    }

    // i está em escopo fora do for
    int i = 10;
    System.out.println("Saiu do laço for");

    System.out.println(i);

  }
}
