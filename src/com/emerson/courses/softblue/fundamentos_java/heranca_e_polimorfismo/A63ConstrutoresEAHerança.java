package com.emerson.courses.softblue.fundamentos_java.heranca_e_polimorfismo;

public class A63ConstrutoresEAHerança {
  public static void main(String[] args) {

    /* Não existe herança de construtores em Java */

    /* Chamada de construtor que não recebe parâmetros */
    CarroB c = new CarroB("Ferrari");

    System.out.println(c.marca);

  }
}
