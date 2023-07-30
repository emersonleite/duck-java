package com.emerson.courses.softblue.fundamentos_java.p3_modificadores_acesso_construtores_elementos_estaticos;

public class Quadrado {

  private double lado;

  public Quadrado(double lado) {
    this.lado = lado;
  }

  public double calcularArea() {
    return Math.pow(lado, 2);
  }

}
