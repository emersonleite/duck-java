package com.emerson.leite.courses.softblue.fundamentos_java.p4_heranca_e_polimorfismo;

public class VeiculoB {

  protected String marca;

  /* super nesse caso é opcional */
  // super();
  /*
   * public VeiculoB() {
   * System.out.println("VeiculoB()");
   * }
   */

  public VeiculoB(String marca) {
    this.marca = marca;
    System.out.println("VeiculoB(String)");
  }

}
