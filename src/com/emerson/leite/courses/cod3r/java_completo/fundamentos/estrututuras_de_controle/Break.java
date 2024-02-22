package com.emerson.leite.courses.cod3r.java_completo.fundamentos.estrututuras_de_controle;

public class Break {

  public static void main(String[] args) {

    for (int i = 0; i < 10; i++) {
      if (i == 5) {
        break;
      }
      System.out.println(i);
    }
  }

}
