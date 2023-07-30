package com.emerson.courses.softblue.fundamentos_java.modificadores_acesso_construtores_elementos_estaticos;

/* Definição do atributo ao lado do nome da classe. Valor não pode ser reatribuido */
public record QuadradoRecord(double lado) {

  public double calcularArea() {
    return lado * lado;
  }

}
