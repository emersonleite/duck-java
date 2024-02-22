package com.emerson.leite.courses.cod3r.java_completo.fundamentos;

public class TiposPrimitivos {

    public static void main(String[] args) {

        // Informações do funcionário

        // Númericos inteiros
        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 586324;
        long pontosAcumulados = 3_234_845_223L;

        // Tipos numéricos com ponto flutuante
        float salario = 11_445.44F;
        double vebdasAcumuladas = 2_991_797_103.01;

        // Tipo booleano
        boolean estaDeFerias = false;

        // Tipo char
        char status = 'A';

        // Dias de empresa
        System.out.println("Anos de empresa: " + anosDeEmpresa * 365);

        // Número de viagens
        System.out.println("Numero de viagens: " + numeroDeVoos / 2);

        // Pontos por real
        System.out.println("Pontos por real: " + pontosAcumulados / vebdasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);

        System.out.println("Férias -> " + estaDeFerias);

        System.out.println("Status: " + status);



    }
}
