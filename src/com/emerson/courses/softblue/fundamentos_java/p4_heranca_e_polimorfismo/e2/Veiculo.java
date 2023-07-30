package com.emerson.courses.softblue.fundamentos_java.p4_heranca_e_polimorfismo.e2;

public class Veiculo {

  private boolean ligado = false;

  public void ligar() {
    ligado = true;
  }

  public void desligar() {
    ligado = false;
  }

  public boolean isLigado() {
    return ligado;
  }

}
