package com.emerson.leite.courses.softblue.fundamentos_java.p4_heranca_e_polimorfismo;

public class Refrigerante extends Bebida {

  public Refrigerante() {
    super("Refrigerante", false);

  }

  @Override
  public void preparar() {
    System.out.println("Pegando o copo");
    System.out.println("Colocando gelo no copo");
    System.out.println("Colocando o refrigerante");
  }

}
