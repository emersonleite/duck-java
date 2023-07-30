package com.emerson.courses.softblue.fundamentos_java.heranca_e_polimorfismo;

public class Bebida {

  private String nome;
  private boolean aquecer;

  public Bebida(String nome, boolean aquecer) {
    this.nome = nome;
    this.aquecer = aquecer;
  }

  public String getNome() {
    return nome;
  }

  public boolean isAquecer() {
    return aquecer;
  }

  public void preparar() {
  }

}
