package com.emerson.leite.courses.softblue.fundamentos_java.p5_classes_abstratas_e_interfaces;

public class FerrariB implements AutomovelB {

  @Override
  public void acelerar() {
    System.out.println("Ferrari acelerou");
  }

  @Override
  public void frear() {
    System.out.println("Ferrari freou");
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
