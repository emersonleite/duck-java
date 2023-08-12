package com.emerson.courses.softblue.fundamentos_java.p7_strings_datas_e_numeros;

import java.util.Random;

public class A98GerandoNumerosRandomicos {

  public static void main(String[] args) {

    /* Com Math.random */
    for (int i = 0; i < 10; i++) {
      double d = Math.random();
      System.out.println((i + 1) + " => " + d);
    }

    Random r = new Random();

    /* Gerando números inteiros com toda gama de números */
    for (int i = 0; i < 10; i++) {
      int d = r.nextInt();
      System.out.println((i + 1) + " => " + d);
    }

    /* Gerando números inteiros até 100 */
    for (int i = 0; i < 10; i++) {
      int d = r.nextInt(100);
      System.out.println((i + 1) + " => " + d);
    }

    /* Passando uma semente 12345678 */
    Random r1 = new Random(12345678);
    /* Gerando números inteiros até 100 */
    for (int i = 0; i < 10; i++) {
      int d = r1.nextInt(100);
      System.out.println((i + 1) + " => " + d);
    }

    /* Com intervalos determinados */
    System.out.println(gerarInt(1, 500));

  }

  /* Exemplo de funcao */
  static int gerarInt(int inicio, int fim) {
    int intervalo = fim - inicio;
    int n = (int) (Math.random() * intervalo) + inicio;
    return n;
  }
}
