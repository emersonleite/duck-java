package com.emerson.courses.softblue.fundamentos_java.heranca_e_polimorfismo;

public class Cachorro extends Animal {

  @Override
  public void falar() {
    System.out.println("AU AU");
  }

  public void morder() {
    System.out.println("NHAC");
  }

}
