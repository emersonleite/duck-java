package com.emerson.leite.courses.softblue.fundamentos_java.p4_heranca_e_polimorfismo;

public class Cachorro extends Animal {

  @Override
  public void falar() {
    System.out.println("AU AU");
  }

  public void morder() {
    System.out.println("NHAC");
  }

}
