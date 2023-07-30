package com.emerson.courses.softblue.fundamentos_java.heranca_e_polimorfismo;

import com.emerson.courses.algaworks.utils.Mostrar;

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
