package com.emerson.courses.algaworks.banco.modelo.pagamento;

/* Pode-se extender uma interface de outra */
public interface DocumentoEstornavel extends DocumentoPagavel {

  /* Nesse caso não se precisa declarar esses métodos abaixo */
  /*
   * double getValorTotal();
   * 
   * boolean estaPago();
   */

  void estornarPagamento();
}
