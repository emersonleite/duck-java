package com.emerson.leite.courses.cod3r.java_completo.fundamentos.operadores;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        var x = 34.56;
        double y = 2.2;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);

        int a = 8;
        int b = 3;

        System.out.println(a / (double) b); // Casting
        System.out.println(a / (float) b); // Casting

        System.out.println(a % b); // Resto da divisão

        System.out.println(x + y - a * b);


    }

}
