package com.emerson.courses.softblue.fundamentos_java.p6_tratamento_de_excecoes;

public class A84ComoUtilizarOBlocoFinally {
  /*
   * finally Pode ser utilizado mesmo sem um bloco try
   * o bloco é xecutado antes de se lancar a excecao
   */
  public static void main(String[] args) {

    Banco banco = new Banco(1500);
    try {
      banco.realizarOperacaoComOutroTratamento(1200);
    } catch (BancoException e) {
      System.out.println("Ocorreu um erro: " + e.getMessage());
      /* Pegando a classe que causa a excecao */
      System.out.println(e.getCause());
    } finally {
      System.out.println("O saldo é de " + banco.conta.getSaldo());
    }
  }
}
