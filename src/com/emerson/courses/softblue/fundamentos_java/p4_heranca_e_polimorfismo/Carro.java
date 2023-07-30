package com.emerson.courses.softblue.fundamentos_java.p4_heranca_e_polimorfismo;

public class Carro extends Veiculo {

  /* Atributo específico de Carro */
  private boolean quatroPortas;

  public boolean isQuatroPortas() {
    return quatroPortas;
  }

  public void setQuatroPortas(boolean quatroPortas) {
    this.quatroPortas = quatroPortas;
  }

  @Override
  public void imprimirDados() {
    super.imprimirDados();
    System.out.println("Quatro portas: " + this.quatroPortas);
  }

}
