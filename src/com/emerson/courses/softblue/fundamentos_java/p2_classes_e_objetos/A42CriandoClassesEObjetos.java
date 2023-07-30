package com.emerson.courses.softblue.fundamentos_java.p2_classes_e_objetos;

import com.emerson.utils.Mostrar;

public class A42CriandoClassesEObjetos {

  public static void main(String[] args) {

    Pessoa p1 = new Pessoa();
    Pessoa p2 = new Pessoa();

    p1.nome = "Emerson";
    p1.receber(10);
    System.out.println(p1.nome + " => " + p1.numFigurinhas);

    p2.nome = "João";
    p2.receber(10);
    System.out.println(p2.nome + " => " + p2.numFigurinhas);

    Mostrar.titulo("Depois de p1 dar a p2");
    p1.dar(2, p2);

    System.out.println(p1.nome + " => " + p1.numFigurinhas);
    System.out.println(p2.nome + " => " + p2.numFigurinhas);

  }
}
