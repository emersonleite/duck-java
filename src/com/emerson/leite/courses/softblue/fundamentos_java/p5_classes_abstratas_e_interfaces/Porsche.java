package com.emerson.leite.courses.softblue.fundamentos_java.p5_classes_abstratas_e_interfaces;

public class Porsche implements AutomovelB {

  @Override
  public void acelerar() {
    System.out.println("Porsche acelerou");
  }

  @Override
  public void frear() {
    System.out.println("Porsche freou");
  }

  /*
   * @Override
   * public void derrapar() {
   * acelerar();
   * acelerar();
   * frear();
   * }
   */

}
