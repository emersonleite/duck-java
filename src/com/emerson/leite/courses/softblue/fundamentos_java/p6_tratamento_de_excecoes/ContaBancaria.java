package com.emerson.leite.courses.softblue.fundamentos_java.p6_tratamento_de_excecoes;

public class ContaBancaria {

  private double saldo;

  public ContaBancaria(double saldo) {
    this.saldo = saldo;
  }

  /* 'throws Exception' obriga o erro a ser tratado */
  public void sacar(double valor) throws ValorNegativoException, SaldoInsuficienteNaContaException {
    /*
     * if (saldo < 0) {
     * throw new Exception("O valor para saque é negativo");
     * }
     * 
     * if (saldo - valor < 0) {
     * throw new Exception("O saldo é insuficiente");
     * }
     */

    /* Lançando as exceções criadas pelo usuário */
    if (valor <= 0) {
      throw new ValorNegativoException(valor);
    }

    if (saldo - valor < 0) {
      throw new SaldoInsuficienteNaContaException(valor, saldo);
    }

    this.saldo -= valor;
  }

  public double getSaldo() {
    return saldo;
  }

}
