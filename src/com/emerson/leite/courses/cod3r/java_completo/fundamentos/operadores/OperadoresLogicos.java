package com.emerson.leite.courses.cod3r.java_completo.fundamentos.operadores;

public class OperadoresLogicos {

    public static void main(String[] args) {


        boolean condicao1 = true;

        boolean condicao2 = 3 > 7;

        System.out.println(condicao1 && condicao2);
        System.out.println(condicao1 || condicao2);
        System.out.println(condicao1 ^ condicao2); // ou exclusivo - XOR
        System.out.println(!condicao1);
        System.out.println(!!condicao1);
        System.out.println(!condicao2);


    }
}
