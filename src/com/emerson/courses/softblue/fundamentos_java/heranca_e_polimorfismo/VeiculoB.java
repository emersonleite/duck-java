package com.emerson.courses.softblue.fundamentos_java.heranca_e_polimorfismo;

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
