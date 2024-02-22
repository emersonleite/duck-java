package com.emerson.leite.courses.algaworks.mergulho_java_julho_2023.banco.app;

import java.math.BigDecimal;

public class TesteCalculos {
  public static void main(String[] args) {

    // Para valores monetários evitar double, float.
    // Saída - 0.40
    BigDecimal x = new BigDecimal("1.0");
    x = x.subtract(new BigDecimal("0.10"));
    x = x.subtract(new BigDecimal("0.20"));
    x = x.subtract(new BigDecimal("0.30"));
    System.out.println(x);

    // Errado:
    // Saída - 0.39999999999999997
    double y = 1.0;
    y = y - 0.10;
    y = y - 0.20;
    y = y - 0.30;
    System.out.println(y);
  }
}
