package com.emerson.leite.courses.softblue.fundamentos_java.p5_classes_abstratas_e_interfaces;

public class A72CriandoClassesAbstratas {

  public static void main(String[] args) {

    Diamante d = new Diamante();
    d.pegar();

    Cogumelo c = new Cogumelo();
    c.pegar();

    Moeda m = new Moeda();
    m.pegar();

    Maca m1 = new Maca();
    m1.pegar();

    /* Aqui pode-se se utilizar Item. Acontece casting implícito. */
    Item m3 = new Maca();
    m3.pegar();

  }
}
