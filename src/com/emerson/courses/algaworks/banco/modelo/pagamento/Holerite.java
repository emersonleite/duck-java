package com.emerson.courses.algaworks.banco.modelo.pagamento;

import java.math.BigDecimal;

import com.emerson.courses.algaworks.banco.modelo.Pessoa;

public class Holerite implements DocumentoPagavel {

  private Pessoa funcionario;
  private BigDecimal valorHora;
  private int quantidadeDeHoras;
  private boolean pago;

  public Holerite(Pessoa funcionario, BigDecimal valorHora, int quantidadeDeHoras) {
    this.funcionario = funcionario;
    this.valorHora = valorHora;
    this.quantidadeDeHoras = quantidadeDeHoras;
  }

  @Override
  public boolean estaPago() {
    return pago;
  }

  @Override
  public BigDecimal getValorTotal() {
    return valorHora.multiply(new BigDecimal(quantidadeDeHoras));
  }

  @Override
  public void quitarPagamento() {
    pago = true;
  }

  public Pessoa getFuncionario() {
    return funcionario;
  }

  public void setFuncionario(Pessoa funcionario) {
    this.funcionario = funcionario;
  }

}
