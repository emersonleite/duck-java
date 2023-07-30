package com.emerson.courses.softblue.fundamentos_java.p2_classes_e_objetos;

public class Matematica {

  int somar(int x, int y) {
    return x + y;
  }

  /* Sobrecarga com variação nos parâmetros, dentro de uma mesma classe */
  int somar(int x, int y, int z) {
    return x + y + z;
  }

  double somar(double x, double y) {
    return x + y;
  }

}
