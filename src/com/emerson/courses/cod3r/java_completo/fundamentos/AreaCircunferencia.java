package com.emerson.courses.cod3r.java_completo.fundamentos;

public class AreaCircunferencia {

    public static void main(String[] args) {

        double raio = 3.4;

        // Constante
        final double PI = 3.14159;

        double area = PI * raio * raio;
        System.out.println("Area = " + area + "m2");

        raio = 10;
        area = PI * raio * raio;
        System.out.println("Area = " + area + "m2");

    }

}
