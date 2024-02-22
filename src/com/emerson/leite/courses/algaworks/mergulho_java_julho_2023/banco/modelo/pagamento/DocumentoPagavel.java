package com.emerson.leite.courses.algaworks.mergulho_java_julho_2023.banco.modelo.pagamento;

import java.math.BigDecimal;

/* Não se instacia um INTERFACE. Os métodos são, por definição abstratos por natureza */
public interface DocumentoPagavel {

  BigDecimal getValorTotal();

  boolean estaPago();

  void quitarPagamento();

  /*
   * Método com implementação padrão para evitar quebra de código. Usar com
   * moderação
   */

  default void imprimirRecibo() {
    System.out.println("RECIBO: ");
    System.out.println("Valor total: " + getValorTotal());
    System.out.println("Pago: " + estaPago());
  }
}
