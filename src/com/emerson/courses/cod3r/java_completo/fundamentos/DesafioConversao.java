package com.emerson.courses.cod3r.java_completo.fundamentos;

import java.util.Locale;
import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Locale.setDefault(Locale.US);

        var locale = Locale.getDefault().toString();

        System.out.println(locale);

        System.out.println("Entre com o salário 1");
        String salario1 = sc.nextLine();
        double salario1b = Double.parseDouble(salario1.replace(",", "."));


        System.out.println("Entre com o salário 2");
        String salario2 = sc.nextLine();
        double salario2b = Double.parseDouble(salario2.replace(",", "."));


        System.out.println("Entre com o salário 3");
        String salario3 = sc.nextLine();
        double salario3b = Double.parseDouble(salario3.replace(",", "."));


        System.out.println("Média " + ((salario1b + salario2b + salario3b) / 3));
    }
}
