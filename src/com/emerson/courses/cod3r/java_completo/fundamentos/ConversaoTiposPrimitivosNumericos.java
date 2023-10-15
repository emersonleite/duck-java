package com.emerson.courses.cod3r.java_completo.fundamentos;

public class ConversaoTiposPrimitivosNumericos {

    public static void main(String[] args) {

        // Conversão implícita - ocorre sem problemas
        double a = 1;
        System.out.println(a);

        // Conversão explícita - CAST
        float b = (float) 1.5215477445455215646;
        System.out.println(b); // 1.5215478

        // Conversão explícita - CAST
        int c = 128;
        byte d = (byte) c;
        System.out.println(d); // -128, nesse caso deu não deu o que se esperava

        double e = 1;
        int f = (int) e;
        System.out.println(f);
    }
}
