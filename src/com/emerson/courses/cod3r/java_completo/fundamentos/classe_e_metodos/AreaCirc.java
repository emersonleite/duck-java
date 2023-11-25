package com.emerson.courses.cod3r.java_completo.fundamentos.classe_e_metodos;

public class AreaCirc {

  double raio;

  /* Variável de classe com static */
  /* final para definir constante */
  static final double PI = 3.1415;

  AreaCirc(double raioInicial) {
    raio = raioInicial;
  }

  double area() {
    return PI * Math.pow(raio, 2);
  }

  /* Método estático */
  static double areaEstatica(double raio) {
    return PI * Math.pow(raio, 2);
  }

}
