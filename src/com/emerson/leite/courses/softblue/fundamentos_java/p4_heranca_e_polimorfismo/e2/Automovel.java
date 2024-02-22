package com.emerson.leite.courses.softblue.fundamentos_java.p4_heranca_e_polimorfismo.e2;

public class Automovel extends Veiculo {

  @Override
  public void ligar() {
    super.ligar();
    System.out.println("Automóvel ligado.");
  }

  @Override
  public void desligar() {
    super.desligar();
    System.out.println("Automóvel desligado.");
  }

}
