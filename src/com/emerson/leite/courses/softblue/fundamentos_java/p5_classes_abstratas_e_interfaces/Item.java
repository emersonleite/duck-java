package com.emerson.leite.courses.softblue.fundamentos_java.p5_classes_abstratas_e_interfaces;

public abstract class Item {

  private int posX;
  private int posY;

  /*
   * Faz mais sentido o pegar() ser ABSTRATO. Aqui ele não tem implementação. O
   * método abstrato só pode existir em uma classe abstrata;
   * Pode haver métodos não abstratos em classes abstratas;
   */

  public abstract void pegar();

  public int getPosX() {
    return posX;
  }

  public void setPosX(int posX) {
    this.posX = posX;
  }

  public int getPosY() {
    return posY;
  }

  public void setPosY(int posY) {
    this.posY = posY;
  }

}
