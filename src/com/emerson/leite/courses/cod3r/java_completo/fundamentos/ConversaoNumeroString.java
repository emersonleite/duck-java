package com.emerson.leite.courses.cod3r.java_completo.fundamentos;

public class ConversaoNumeroString {

    public static void main(String[] args) {

        Integer num1 = 10000;

        // Com toString
        System.out.println(num1.toString());

        System.out.println(num1.toString().length());

        int num2 = 988541;
        System.out.println(Integer.toString(num2));
        System.out.println(Integer.toString(num2).length());

        // Forma não usual concatenando uma string
        System.out.println(("" + num1));
        System.out.println(("" + num1).length());

    }

}
