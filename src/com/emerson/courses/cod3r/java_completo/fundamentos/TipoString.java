package com.emerson.courses.cod3r.java_completo.fundamentos;

public class TipoString {

    public static void main(String[] args) {

        System.out.println("Olá pessoal".charAt(2));

        // String é um objeto imutável. Não é possível mudar o valor original.
        // Se precisar de transformação, recorrer a outra variável, ou re atribuir a própria variável


        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.length());
        System.out.println(s.endsWith("tarde"));
        System.out.println(s.equals("Boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        s = "Boa noite!!!";

        var nome = "Pedro";
        nome = nome.toUpperCase();
        System.out.println(nome);

        System.out.printf("Nome: %s %n", nome);

        // Criando a string com String.format
        String frase = String.format("O nome dele é %s", nome);
        System.out.println(frase);

        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".substring(6, 10));
    }
}
