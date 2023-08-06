package com.emerson.courses.softblue.fundamentos_java.p5_classes_abstratas_e_interfaces;

public class A74ModificadoresDefaultEStatic {

  public static void main(String[] args) {

    FerrariB f = new FerrariB();

    Porsche p = new Porsche();

    /* Métodos definidos na própria interface */
    f.derrapar();
    p.derrapar();

    System.out.println(AutomovelB.getVelocidadeMaxima());

  }

}
