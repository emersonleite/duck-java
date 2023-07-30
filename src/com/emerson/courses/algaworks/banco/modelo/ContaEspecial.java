package com.emerson.courses.algaworks.banco.modelo;

import java.math.BigDecimal;

/* HERANÇA com palavra chave 'extends'  */
public class ContaEspecial extends Conta {

  private BigDecimal valorLimite;

  public ContaEspecial(Pessoa titular, int agencia, int numero, BigDecimal valorLimite) {
    super(titular, agencia, numero);
    this.valorLimite = valorLimite;
  }

  public BigDecimal getValorLimite() {
    return valorLimite;
  }

  public void setValorLimite(BigDecimal valorLimite) {
    this.valorLimite = valorLimite;
  }

  /* SOBRESCRITA de métodos */
  @Override
  public BigDecimal getSaldoDisponivel() {
    return getSaldo().add(getValorLimite());
  }

  /* Implementado método ABSTRATO da SUPERCLASSE */
  @Override
  public void debitarTarifasMensal() {
    sacar(new BigDecimal("20"));
  }

}
