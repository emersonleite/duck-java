package com.emerson.courses.softblue.fundamentos_java.p6_tratamento_de_excecoes;

public class A83TrabalhandoComUncheckedExceptions {
  /*
   * Unchecked Exceptions pode ser lancadas mesmo que throws não a comtemple, ou
   * sejam, não precisam estar explícitas
   * 
   * São excecoes que demonstram erros de programacao e não são tradadas,
   * geralmente
   */
  public static void main(String[] args) {

    // Object o1 = new Object();
    Object o2 = new Object();

    // boolean iguais = Comparador.comparar(o1, o2);

    try {
      boolean iguais = Comparador.comparar(null, o2);
      System.out.println(iguais);
    } catch (NullPointerException e) {
      System.out.println("O objeto é nulo");
    }

  }

}
