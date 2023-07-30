package com.emerson.courses.softblue.fundamentos_java.p1_conceitos_iniciais;

public class A33TipoVar {

  public static void main(String[] args) {

    int x = 10;

    /* Var assume o tipo int quando há a atribuição */
    var x2 = 10;

    /* Erro, pois não se pode reatribuir outro tipo de variável */
    // x2 = 10.0;

    System.out.println(x);
    System.out.println(x2);

    /* Erro, pois não foi inicializado */
    // var z;

  }
}
