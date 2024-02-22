package com.emerson.leite.courses.cod3r.java_completo.fundamentos.estrututuras_de_controle;

public class SwitchSemBreak {

    public static void main(String[] args) {

        String faixa = "preta";

        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei o Bassai-dai");
            case "marrom":
                System.out.println("Sei o Tekki Shodan");
            case "roxa":
                System.out.println("Sei o Heian Godan");
            case "verde":
                System.out.println("Sei o Heian Yodan");
            case "laranja":
                System.out.println("Sei o Heain Sandan");
            case "vermelha":
                System.out.println("Sei o Heian Nidan ");
            case "amarela":
                System.out.println("Sei o Heian Shodan");
                break;
            default:
                System.out.println("Não sei de nada..");
        }

        System.out.println();

        /* Outra forma sem break */
        switch (faixa) {
            case "preta" ->
                System.out.println("Sei o Bassai-dai");
            case "marrom" ->
                System.out.println("Sei o Tekki Shodan");
            case "roxa" ->
                System.out.println("Sei o Heian Godan");
            case "verde" ->
                System.out.println("Sei o Heian Yodan");
            case "laranja" ->
                System.out.println("Sei o Heain Sandan");
            case "vermelha" ->
                System.out.println("Sei o Heian Nidan ");
            case "amarela" ->
                System.out.println("Sei o Heian Shodan");
            default ->
                System.out.println("Não sei de nada..");
        }

    }

}
