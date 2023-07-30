package com.emerson.courses.softblue.fundamentos_java.heranca_e_polimorfismo;

public class Caminhao extends Veiculo {

  /* Sobrecarga do métodos buzinar. Preferível utilizar @Override */
  @Override
  public void buzinar() {
    System.out.println("FOM FOM");
  }

}
