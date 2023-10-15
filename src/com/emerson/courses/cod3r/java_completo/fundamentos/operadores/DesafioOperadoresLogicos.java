package com.emerson.courses.cod3r.java_completo.fundamentos.operadores;

public class DesafioOperadoresLogicos {

    public static void main(String[] args) {


        boolean trabalho1 = false;
        boolean trabalho2 = true;

        boolean comprouTv50 = trabalho1 && trabalho2;
        System.out.println("Comprou Tv 50\"? " + comprouTv50);

        boolean comprouTv32 = trabalho1 ^ trabalho2;
        System.out.println("Comprou Tv 32\"? " + comprouTv32);

        boolean comprouSorvete = trabalho1 || trabalho2;
        System.out.println("Comprou sorvete? " + comprouSorvete);


        // Operador unário
        System.out.println("Mais saudável? " +  !comprouSorvete);



    }

}
