package com.emerson.leite.courses.softblue.fundamentos_java.p6_tratamento_de_excecoes;

public class ValorNegativoException extends Exception {

  private double valor;

  public ValorNegativoException(double valor) {
    this.valor = valor;
  }

  public double getValor() {
    return valor;
  }

}
