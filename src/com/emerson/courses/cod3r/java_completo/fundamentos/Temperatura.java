package com.emerson.courses.cod3r.java_completo.fundamentos;

public class Temperatura {

    public static void main(String[] args) {

        double grausFahrenheit = 86;
        final double FATOR1 = 32.0;
        final double FATOR2 = (double) 5 / 9; // Casting

        // ou
        // double fator2 = 5.0 / 9;


        double grausCelsius = (grausFahrenheit - FATOR1) * FATOR2;

        System.out.println("Graus Celsius = " + grausCelsius);

    }

}
