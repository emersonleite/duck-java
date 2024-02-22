package com.emerson.leite.courses.algaworks.mergulho_java_julho_2023.banco.modelo.pagamento;

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
