package com.emerson.leite.courses.algaworks.mergulho_java_julho_2023.banco.modelo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Banco {
  private List<Conta> contas = new ArrayList<>();

  public Banco() {

    Pessoa pessoa1 = new Pessoa("Emerson Leite", "85236328");
    Pessoa pessoa2 = new Pessoa("Stella Leite", "74236328");

    Conta conta1 = new ContaInvestimento(pessoa1, 222, 999);
    Conta conta2 = new ContaInvestimento(pessoa1, 123, 888);
    Conta conta3 = new ContaInvestimento(pessoa2, 123, 567);
    Conta conta4 = new ContaEspecial(pessoa1, 123, 188, new BigDecimal("1000"));
    Conta conta5 = new ContaEspecial(pessoa2, 123, 222, new BigDecimal("1000"));

    conta1.depositar(new BigDecimal("120"));
    conta2.depositar(new BigDecimal("150"));
    conta3.depositar(new BigDecimal("500"));
    conta4.depositar(new BigDecimal("500"));
    conta5.depositar(new BigDecimal("12000"));

    contas.add(conta1);
    contas.add(conta2);
    contas.add(conta3);
    contas.add(conta4);
    contas.add(conta5);

  }

  public List<Conta> getContas() {
    return contas;
  }

  /*
   * public Conta buscar(int agencia, int numeroConta) {
   * for (Conta conta : getContas()) {
   * if (conta.getAgencia() == agencia && conta.getNumero() == numeroConta) {
   * return conta;
   * }
   * }
   * return null;
   * }
   */

  /*
   * Evitar exceções de null
   * Ulização da classe OPTIONAL
   */
  public Optional<Conta> buscar(int agencia, int numeroConta) {
    for (Conta conta : getContas()) {
      if (conta.getAgencia() == agencia && conta.getNumero() == numeroConta) {
        return Optional.of(conta);
      }
    }
    return Optional.empty();
  }
}
