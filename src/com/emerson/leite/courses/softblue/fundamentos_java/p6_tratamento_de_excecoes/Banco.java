package com.emerson.leite.courses.softblue.fundamentos_java.p6_tratamento_de_excecoes;

public class Banco {

  ContaBancaria conta;

  public Banco(double saldoInicial) {
    conta = new ContaBancaria(saldoInicial);
  }

  /* Lançando a exceção para quem chama. Ela não é tratada aqui */
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

  /* Com uma excecao que envolve as outras duas */
  public void realizarOperacaoComOutroTratamento(double valorASacar) throws BancoException {
    try {
      conta.sacar(valorASacar);
    } catch (ValorNegativoException e) {
      throw new BancoException("Erro de saque: Valor negativo", e);
    } catch (SaldoInsuficienteNaContaException e) {
      throw new BancoException("Erro de saque: Saldo insuficiente", e);
    }
  }

}
