package com.emerson.leite.courses.algaworks.mergulho_java_julho_2023.banco.modelo.excecao;

/* Se se herdar Exception a exceção tem que ser, necessariamente, tratada  */
public class SaldoInsuficienteException extends RuntimeException /* Exception */ {

  public SaldoInsuficienteException(String message) {
    super(message);
  }

}
