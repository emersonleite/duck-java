package com.emerson.leite.courses.softblue.fundamentos_java.p3_modificadores_acesso_construtores_elementos_estaticos;

public class A52ModificadoresDeAcesso {

  public static void main(String[] args) {

    ContaBancaria c = new ContaBancaria();

    c.setNumConta(53652);
    c.setAtiva(true);
    c.depositar(5000);
    c.sacar(1000);

    System.out.println(c.getSaldo());

  }

}
