package com.emerson.leite.courses.softblue.fundamentos_java.p6_tratamento_de_excecoes;

public class A85CompreendendoAStacktrace {

  /*
   * Fornece a causa das excecoes;
   * E mostra o ponto onde ocorreu o erro;
   * Mostra a pilha de chamada de métodos;
   * 
   */
  public static void main(String[] args) /* throws Exception */ {

    Automovel auto = new Automovel();
    Pista p = new Pista();

    try {
      auto.acelerar(100);
      auto.acelerar(80);
    } catch (AcimaVelocidadeMaximaException e) {
      System.out.println("ERRO");
      /* Mostrando a stack trace */
      e.printStackTrace();
    }

    try {
      p.iniciar();
    } catch (PistaException e) {
      /*
       * Se atentar à
       * 
       * Caused by:
       * com.emerson.leite.courses.softblue.fundamentos_java.p6_tratamento_de_excecoes.
       * AcimaVelocidadeMaximaException: Excedeu a velocidade máxima
       * 
       */
      e.printStackTrace();
    }

  }

}
