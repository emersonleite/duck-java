package com.emerson.leite.courses.softblue.fundamentos_java.p6_tratamento_de_excecoes;

public class A87TrabalhandoComAssertions {

  public static void main(String[] args) {

    ResultadoBhaskara r = new ResultadoBhaskara();

    /* Esse código roda normalmente */
    /*
     * double a = 1.0;
     * double b = 3;
     * double c = -4;
     */

    /*
     * Abaixo retorna
     * r1 = NaN
     * r2 = NaN
     * pois delta é negativo
     */

    double a = 1.0;
    double b = 2;
    double c = 16;

    Matematica.calcularBhaskara(a, b, c, r);

    System.out.println("r1 = " + r.getR1());
    System.out.println("r2 = " + r.getR2());

  }

}
