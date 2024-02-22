package com.emerson.leite.courses.cod3r.java_completo.fundamentos.classe_e_metodos;

public class PrimeiroTrauma {

  int a = 3;
  static int b = 4;

  public static void main(String[] args) {
    // System.out.println(a); // erro

    PrimeiroTrauma p = new PrimeiroTrauma();

    System.out.println(p.a);

    System.out.println(b); // aqui funciona pois b é static
  }

}
