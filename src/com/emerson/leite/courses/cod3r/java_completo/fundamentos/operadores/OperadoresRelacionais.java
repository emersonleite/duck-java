package com.emerson.leite.courses.cod3r.java_completo.fundamentos.operadores;

public class OperadoresRelacionais {

    public static void main(String[] args) {

        int a = 97;
        int b = 'a'; // 97 na tabela unicode


        System.out.println(a == b);     // true
        System.out.println(3 > 4);      // false
        System.out.println(3>=3);       // true
        System.out.println(3 < 7);      // true
        System.out.println(30 <= 7);    // false
        System.out.println(30 != 7);    // true

        double nota = 7.3;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;

        System.out.println("Tem desconto? " + temDesconto);
    }
}
