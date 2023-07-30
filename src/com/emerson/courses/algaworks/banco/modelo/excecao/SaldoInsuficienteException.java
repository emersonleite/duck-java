package com.emerson.courses.algaworks.banco.modelo.excecao;

/* Se se herdar Exception a exceção tem que ser, necessariamente, tratada  */
public class SaldoInsuficienteException extends RuntimeException /* Exception */ {

  public SaldoInsuficienteException(String message) {
    super(message);
  }

}
