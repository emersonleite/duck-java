package com.emerson.leite.courses.algaworks.mergulho_java_julho_2023.banco.modelo;

import java.math.BigDecimal;
import java.math.RoundingMode;

/* HERANÇA com palavra chave 'extends'  */
public class ContaInvestimento extends Conta {

  public ContaInvestimento(Pessoa titular, int agencia, int numero) {
    /* super faz referêcia ao CONSTRUTOR da SUPERCLASSE */
    super(titular, agencia, numero);
  }

  /* Implementado método ABSTRATO da SUPERCLASSE */
  @Override
  public void debitarTarifasMensal() {
    if (getSaldo().compareTo(new BigDecimal("10000")) < 0) {
      sacar(new BigDecimal("30"));
    }
  }

  public void creditarRendimentos(BigDecimal percentualJuros) {
    BigDecimal valorRendimentos = getSaldo().multiply(percentualJuros).divide(new BigDecimal("100"), 2,
        RoundingMode.HALF_EVEN);
    // double valorRendimentos = getSaldo() * (percentualJuros / 100);
    depositar(valorRendimentos);
  }
}
