package com.emerson.courses.cod3r.java_completo.fundamentos;

public class Inferencia {

    public static void main(String[] args) {

        double a = 4.50;
        System.out.println(a);

        var b = 4.50; // Inferencia pelo valor, nesse caso double
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);

        c = "Recebe outro texto";
        System.out.println(c);

        // Não pode ser feito isso
        // c = 4.50;

        double d;           // Declaração
        d = 123.65;         // Inicialização
        System.out.println(d);

        // var e; // Não pode ser declarada somente
        var e = 10;
        System.out.println(e);

        var f = 12;
        // f = 12.01; // erro


    }
}
