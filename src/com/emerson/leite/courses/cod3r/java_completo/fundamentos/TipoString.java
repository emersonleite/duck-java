package com.emerson.leite.courses.cod3r.java_completo.fundamentos;

public class TipoString {

    public static void main(String[] args) {

        System.out.println("Olá pessoal".charAt(2));

        // ‘String’ é um objeto imutável.
        // Não é possível mudar o valor original.
        // Se precisar de transformação, recorrer a outra variável, ou re atribuir a própria variável


        String s = "Boa tarde";
        System.out.println(s.concat("!!!"));
        System.out.println(s.startsWith("Boa"));
        System.out.println(s.length());
        System.out.println(s.endsWith("tarde"));
        System.out.println(s.equals("Boa tarde"));
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        s = "Boa noite!!!";
        int idade = 32;
        var salario = 523.005;

        var nome = "Pedro";
        nome = nome.toUpperCase();
        System.out.println(nome);

        // Com printf é possível imprimir com formatação
        System.out.printf("Nome: %s, %d anos, salário: R$ %.2f \n", nome, idade, salario);

        // Criando a ‘string’ formatada com String.format
        String frase = String.format("Nome: %s, %d anos, salário: R$ %.2f \n", nome, idade, salario);
        System.out.println(frase);

        System.out.println("Frase qualquer".contains("qual"));
        System.out.println("Frase qualquer".substring(6, 10));
    }
}
