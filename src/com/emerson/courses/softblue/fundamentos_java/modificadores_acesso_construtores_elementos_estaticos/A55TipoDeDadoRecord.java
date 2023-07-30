package com.emerson.courses.softblue.fundamentos_java.modificadores_acesso_construtores_elementos_estaticos;

import com.emerson.courses.algaworks.utils.Mostrar;

public class A55TipoDeDadoRecord {
  public static void main(String[] args) {

    QuadradoRecord qr = new QuadradoRecord(6);
    QuadradoRecord qr2 = new QuadradoRecord(6);
    RetanguloRecord rr = new RetanguloRecord();

    /* Método toString com padrão de apresentação diferente */
    Mostrar.titulo("Mostrando o quadrado:");
    System.out.println(qr); // QuadradoRecord[lado=6.0]

    /*
     * O record também cosidera a igualdade entre objetos a partir de records com
     * equals
     */
    Mostrar.titulo("Mostrando se os quadrados são iguais:");
    System.out.println(qr.equals(qr2)); // true

    Mostrar.titulo("Mostrando o retangulo:");
    System.out.println(rr);

    Mostrar.titulo("Mostrado largura e altura com getters que assumem a forma largura() e altura()");
    System.err.println("altura: " + rr.altura() + " e largura: " + rr.largura());

    Mostrar.titulo("Mostrado Retangulo criado a partir de método estático");
    RetanguloRecord r3 = RetanguloRecord.create(10);
    System.err.println(r3);

  }
}
