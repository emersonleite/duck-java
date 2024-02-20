package com.emerson.courses.pos_graduacao;

import com.emerson.utils.Mostrar;

public class Atividade05 {
  public static void main(String[] args) {
    Identifier identifier = new Identifier();
    System.out.println(identifier.validateIdentifier("Test")); // Saída: true
    System.out.println(identifier.validateIdentifier("Test1")); // Saída: true
    System.out.println(identifier.validateIdentifier("Test4")); // Saída: false
    System.out.println(identifier.validateIdentifier("T#$st")); // Saída: false
    System.out.println(identifier.validateIdentifier("Testw@")); // Saída: false

    Mostrar.titulo("Ola");

  }
}
