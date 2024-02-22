package com.emerson.leite.courses.algaworks.mergulho_java_julho_2023.banco.modelo.pagamento;

import java.math.BigDecimal;

import com.emerson.leite.courses.algaworks.mergulho_java_julho_2023.banco.modelo.Pessoa;

/* 1. Para INTERFACE se usa a palavra chave 'implements' */

/* 2. Um classe pode implementar várias interfaces */

/* Como DocumentoEstornavel extende DocumentoPagavel a
declaração abaixo é redundante e foi comentada   */

public class Boleto implements DocumentoEstornavel /* , DocumentoPagavel */ {

  private Pessoa beneficiario;
  private BigDecimal valor;
  private boolean pago;

  public Boleto(Pessoa beneficiario, BigDecimal valor) {
    this.beneficiario = beneficiario;
    this.valor = valor;
  }

  @Override
  public BigDecimal getValorTotal() {
    return valor;
  }

  @Override
  public boolean estaPago() {
    return pago;
  }

  @Override
  public void quitarPagamento() {
    pago = true;
  }

  @Override
  public void estornarPagamento() {
    pago = false;
  }

  public Pessoa getBeneficiario() {
    return beneficiario;
  }

  public void setBeneficiario(Pessoa beneficiario) {
    this.beneficiario = beneficiario;
  }

}
