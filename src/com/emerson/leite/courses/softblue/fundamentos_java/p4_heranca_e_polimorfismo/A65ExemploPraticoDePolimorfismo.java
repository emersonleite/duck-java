package com.emerson.leite.courses.softblue.fundamentos_java.p4_heranca_e_polimorfismo;

import com.emerson.leite.utils.Mostrar;

public class A65ExemploPraticoDePolimorfismo {

  public static void main(String[] args) {

    LeiteQuente leite = new LeiteQuente();
    Refrigerante refrigerante = new Refrigerante();

    Preparador preparador = new Preparador();

    Mostrar.titulo("Leite");
    preparador.prepararBebida(leite);

    Mostrar.titulo("Refrigerante");
    preparador.prepararBebida(refrigerante);

  }

}
