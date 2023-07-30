package com.emerson.courses.softblue.fundamentos_java.heranca_e_polimorfismo;

import com.emerson.courses.algaworks.utils.Mostrar;

public class A64AplicandoPolimorfismoNoJava {
  /*
   * POLIMORFISMO
   * Cachorro, por exemplo é do tipo aninal;
   * 
   * 
   * 
   */

  public static void main(String[] args) {

    Cachorro c = new Cachorro();
    c.falar();

    Mostrar.titulo("Com polimorfismo");
    /*
     * Aqui ocorre um casting implicito, mas a referência na memória é para um tipo
     * cachorro
     */
    Animal c1 = new Cachorro();
    c1.falar();
    /*
     * Morder não encontrado no tipo animal, por isso ele não pode ser chamado aqui
     */
    // c1.morder();

    Mostrar.titulo("Casting explícito");
    /* Casting explícito e verificando se o objeto em memória é do tipo Cachorro */
    if (c1 instanceof Cachorro) {
      Cachorro c2 = (Cachorro) c1;
      c2.morder();
    }

    Mostrar.titulo("Exemplo de uso para método falar");
    Cachorro c2 = new Cachorro();
    Gato g2 = new Gato();

    falar(g2);
    falar(c2);

  }

  private static void falar(Animal a) {
    a.falar();
  }

}
