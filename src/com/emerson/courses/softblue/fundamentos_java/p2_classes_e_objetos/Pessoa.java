package com.emerson.courses.softblue.fundamentos_java.p2_classes_e_objetos;

public class Pessoa {

  String nome;
  int numFigurinhas;

  public void receber(int numFigurinhas) {
    this.numFigurinhas += numFigurinhas;
  }

  public void dar(int numFigurinhas, Pessoa pessoa) {
    this.numFigurinhas -= numFigurinhas;
    pessoa.receber(numFigurinhas);
    // ou
    // pessoa.numFigurinhas += numFigurinhas;
  }

}
