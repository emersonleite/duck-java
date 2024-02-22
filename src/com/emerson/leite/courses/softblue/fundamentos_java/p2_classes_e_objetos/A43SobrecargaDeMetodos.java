package com.emerson.leite.courses.softblue.fundamentos_java.p2_classes_e_objetos;

import com.emerson.leite.utils.Mostrar;

public class A43SobrecargaDeMetodos {

  public static void main(String[] args) {

    Matematica mat = new Matematica();

    Mostrar.titulo("Método 2 par\u00E2metros int");
    int soma = mat.somar(10, 20);
    System.out.println(soma);

    /* Soma com sobrecarga */
    Mostrar.titulo("Método 3 par\u00E2metros int");
    int soma2 = mat.somar(10, 20, 30);
    System.out.println(soma2);

    Mostrar.titulo("Método 2 par\u00E2metros double");
    double soma3 = mat.somar(2.0, 3.0);
    System.out.println(soma3);

    /* Com casting implícito */
    Mostrar.titulo("Método 2 par\u00E2metros int e double -> casting implícito");
    double soma4 = mat.somar(2.0, 3);
    System.out.println(soma4);

  }
}
