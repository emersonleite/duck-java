package com.emerson.courses.softblue.fundamentos_java.p5_classes_abstratas_e_interfaces;

import com.emerson.utils.Mostrar;

public class A73Criando_interfaces {

  public static void main(String[] args) {

    Ferrari f = new Ferrari();
    Rota rota = new Rota();

    rota.ir(f);

    Mostrar.titulo("Trabalhando com interface para mostrar o preço de dois objetos de natureza diferente");

    AnelBrilhante a = new AnelBrilhante();
    Vendedor v = new Vendedor();

    v.mostrarPreco(a);
    v.mostrarPreco(f);

  }
}
