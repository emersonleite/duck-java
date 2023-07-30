package com.emerson.courses.softblue.fundamentos_java.p3_modificadores_acesso_construtores_elementos_estaticos;

public class Contador {

  /* Todos os objetos da classe observam esse objeto */
  private static int valor;

  /* Valor estáticos são inicializados aqui */
  static {
    valor = 1;
  }

  /* Não utilidade para construtor */
  /*
   * public Contador() {
   * valor = 1;
   * }
   */

  public static int getValor() {
    return valor;
  }

  public static void incrementar() {
    valor++;
  }

  /*
   * public void setValor(int valor) {
   * this.valor = valor;
   * }
   */

}
