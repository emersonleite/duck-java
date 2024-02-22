package com.emerson.leite.courses.softblue.fundamentos_java.p6_tratamento_de_excecoes;

public class SaldoInsuficienteNaContaException extends Exception {

  private double valor;
  private double saldo;

  public SaldoInsuficienteNaContaException(double valor, double saldo) {
    this.valor = valor;
    this.saldo = saldo;
  }

  public double getValor() {
    return valor;
  }

  public double getSaldo() {
    return saldo;
  }

  @Override
  public String toString() {
    return "SaldoInsuficienteNaContaException";
  }

}
