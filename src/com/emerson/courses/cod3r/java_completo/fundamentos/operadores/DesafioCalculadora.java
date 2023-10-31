package com.emerson.courses.cod3r.java_completo.fundamentos.operadores;

import java.util.Locale;
import java.util.Scanner;

public class DesafioCalculadora {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o numero 1");
        double num1 = entrada.useLocale(Locale.US).nextDouble();

        System.out.println("Informe o numero 2");
        double num2 = entrada.useLocale(Locale.US).nextDouble();

        System.out.println("Informe a operação");
        String operacao = entrada.next();

        double resultado = "+".equals(operacao) ? num1 + num2 : 0;
        resultado = "-".equals(operacao) ? num1 - num2 : resultado;
        resultado = "*".equals(operacao) ? num1 * num2 : resultado;
        resultado = "/".equals(operacao) ? num1 / num2 : resultado;
        resultado = "%".equals(operacao) ? num1 % num2 : resultado;

        System.out.printf("%.2f %s %.2f = %.2f \n", num1, operacao, num2, resultado);

        entrada.close();
    }
}
