package com.emerson.courses.softblue.fundamentos_java.p4_heranca_e_polimorfismo;

public class Preparador {

  public void prepararBebida(Bebida bebida) {
    System.out.println("Peparando a bebida " + bebida.getNome());

    bebida.preparar();

    if (bebida.isAquecer()) {
      System.out.println("Aquecendo a bebida " + bebida.getNome());
    }

    System.out.println("Bebida preparada com sucesso!");
  }

}
