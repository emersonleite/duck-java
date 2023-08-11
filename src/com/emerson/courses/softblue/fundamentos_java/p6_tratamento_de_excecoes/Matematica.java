package com.emerson.courses.softblue.fundamentos_java.p6_tratamento_de_excecoes;

public class Matematica {

  public static void calcularBhaskara(double a, double b, double c, ResultadoBhaskara r) {
    double delta = calcularDelta(a, b, c);

    double r1 = (-b + Math.sqrt(delta)) / (2 * a);

    double r2 = (-b - Math.sqrt(delta)) / (2 * a);

    r.setValores(r1, r2);

  }

  private static double calcularDelta(double a, double b, double c) {
    double delta = (Math.pow(b, 2)) - (4 * a * c);

    /* Lanca assert error. Necessário ativar assert na jvm */
    // assert delta > 0;

    /* Com mensagem */
    assert delta > 0 : "O valor de delta é " + delta;

    return delta;
  }

}
