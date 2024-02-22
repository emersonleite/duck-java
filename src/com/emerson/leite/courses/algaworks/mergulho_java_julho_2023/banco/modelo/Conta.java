package com.emerson.leite.courses.algaworks.mergulho_java_julho_2023.banco.modelo;

import java.math.BigDecimal;
import java.util.Objects;

import com.emerson.leite.courses.algaworks.mergulho_java_julho_2023.banco.modelo.excecao.SaldoInsuficienteException;

/* 
 * Classe ABSTRATA não permite instanciação de objetos. São utilizadas para HERANÇA na definição de
 * outras classes
 * 
 * Em JAVA somente os tipos primitivos não são objetos;
 * 
 * Tipos primitivos vêm com valor padrão, quando não inicializados;
 * 
 */
public abstract class Conta {

  /* Encapsulando com MODIFICADORES de acesso (private) */
  private Pessoa titular;
  private int agencia;
  private int numero;
  private BigDecimal saldo = BigDecimal.ZERO;

  /* Definindo o CONSTRUTOR padrão */
  Conta() {
  }

  // Definindo o CONSTRUTOR customizado e deixando acessível para outros pacotes
  public Conta(Pessoa titular, int agencia, int numero) {

    Objects.requireNonNull(titular); // Para evitar null

    this.titular = titular;
    this.agencia = agencia;
    this.numero = numero;
  }

  public void depositar(BigDecimal valor) {
    if (valor.compareTo(BigDecimal.ZERO) <= 0) {
      throw new IllegalArgumentException("Valor deve ser maior que 0");
    }
    saldo = saldo.add(valor);
  }

  /* Utiliza-se nesse método exceção personalizada */
  public void sacar(BigDecimal valor) {
    if (valor.compareTo(BigDecimal.ZERO) <= 0) {
      throw new IllegalArgumentException("Valor deve ser maior que 0"); // Lançando exceção
    }

    if (getSaldoDisponivel().subtract(valor).compareTo(BigDecimal.ZERO) < 0) {
      throw new SaldoInsuficienteException("Saldo insuficiente");
    }

    saldo = saldo.subtract(valor);
  }

  // SOBRESCRITA de métodos, mesmo nome
  public void sacar(BigDecimal valor, BigDecimal taxaDeSaque) {
    sacar(valor.add(taxaDeSaque));
  }

  /*
   * Métodos ABSTRATOS deve ser implementados nas classes filhas, a não ser que as
   * classe filhas também sejam ABSTRATAS
   */
  public abstract void debitarTarifasMensal();

  public Pessoa getTitular() {
    return titular;
  }

  public int getAgencia() {
    return agencia;
  }

  public int getNumero() {
    return numero;
  }

  public BigDecimal getSaldo() {
    return saldo;
  }

  public BigDecimal getSaldoDisponivel() {
    return getSaldo();
  }

}
