package com.emerson.courses.softblue.fundamentos_java.modificadores_acesso_construtores_elementos_estaticos;

public class A53ConstrutoresDeClasses {

  public static void main(String[] args) {

    Retangulo r1 = new Retangulo();
    double area1 = r1.calcularArea();

    System.out.println(area1);

    Retangulo r2 = new Retangulo(4.0, 8.0);
    double area2 = r2.calcularArea();
    System.out.println(area2);

    Quadrado q1 = new Quadrado(6);
    double area3 = q1.calcularArea();
    System.out.println(area3);

  }

}
