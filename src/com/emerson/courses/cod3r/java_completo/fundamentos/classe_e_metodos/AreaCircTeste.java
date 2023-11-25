package com.emerson.courses.cod3r.java_completo.fundamentos.classe_e_metodos;

public class AreaCircTeste {

  public static void main(String[] args) {

    AreaCirc a = new AreaCirc(5.6);

    // a.pi = 10;
    // AreaCirc.pi = 3.15;

    System.out.println(a.area());

    double areaB = AreaCirc.areaEstatica(10);

    System.out.println(areaB);

  }

}
