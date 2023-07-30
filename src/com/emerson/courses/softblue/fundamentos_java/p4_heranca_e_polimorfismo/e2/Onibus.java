package com.emerson.courses.softblue.fundamentos_java.p4_heranca_e_polimorfismo.e2;

public class Onibus extends Veiculo {

  @Override
  public void ligar() {
    super.ligar();
    System.out.println("Ônibus ligado.");
  }

  @Override
  public void desligar() {
    super.desligar();
    System.out.println("Ônibus desligado.");
  }

}
