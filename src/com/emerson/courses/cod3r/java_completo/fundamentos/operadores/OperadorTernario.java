package com.emerson.courses.cod3r.java_completo.fundamentos.operadores;

public class OperadorTernario {

    public static void main(String[] args) {

        double media = 6.6;

        String resutado = media >=7.0 ?
                "Aprovado" :
                "em Recuperação";

        System.out.println("O aluno está " + resutado);

    }
}
