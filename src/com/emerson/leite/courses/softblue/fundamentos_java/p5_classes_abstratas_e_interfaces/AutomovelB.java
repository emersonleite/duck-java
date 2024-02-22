package com.emerson.leite.courses.softblue.fundamentos_java.p5_classes_abstratas_e_interfaces;

public interface AutomovelB {

  public void acelerar();

  public void frear();

  /*
   * Quando se utiliza o modificador default o método é defindo na própria
   * interface
   */
  public default void derrapar() {
    acelerar();
    acelerar();
    frear();
  }

  /*
   * Pode-se definir também métodos estáticos. Mas o método pertence à interface
   */
  static int getVelocidadeMaxima() {
    return 300;
  }

}
