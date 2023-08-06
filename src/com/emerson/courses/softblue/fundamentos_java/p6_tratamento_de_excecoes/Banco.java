package com.emerson.courses.softblue.fundamentos_java.p6_tratamento_de_excecoes;

public class Banco {

  ContaBancaria conta;

  public Banco(double saldoInicial) {
    conta = new ContaBancaria(saldoInicial);

  }

  /* Lançando a exceção para quem chama */
  public void realizarOperacao(double valorASacar) throws ValorNegativoException, SaldoInsuficienteNaContaException {

    // ContaBancaria conta = new ContaBancaria(1000);

    /* try { */

    conta.sacar(valorASacar);

    System.out.println("O saque foi realizado com sucesso.");

    /*
     * } catch (Exception e) {
     * System.out.println("Ocorreu um erro no saque. " + e.getMessage());
     * }
     */

    System.out.println(conta.getSaldo());
    /* } */
  }

}
