package com.emerson.courses.cod3r.java_completo.fundamentos;

public class IgualdaDeStrings {

    public static void main(String[] args) {

        // true
        System.err.println("2" == "2");

        String s = new String("2");

        // false
        System.out.println(s == "2");

        // equals
        // true
        System.out.println("2".equals(s));

    }
}
