package com.emerson.courses.softblue.fundamentos_java.p6_tratamento_de_excecoes;

public class A82TratandoELancandoCheckedExceptions {

  public static void main(String[] args) {
    Banco banco = new Banco(1500);

    try {
      banco.realizarOperacao(1200);
    } catch (SaldoInsuficienteNaContaException e) {
      System.out.println("Você tentou sacar " + e.getValor() +
          ", mas tem um saldo de " + e.getSaldo());
    } catch (ValorNegativoException e) {
      System.out.println("Você tentou sacar um valor negativo de " + e.getValor());
    }
    // Ou mais genérico:
    /*
     * catch (Exception e) {
     * System.out.println("Ocorreu um erro.");
     * }
     */

  }

}
