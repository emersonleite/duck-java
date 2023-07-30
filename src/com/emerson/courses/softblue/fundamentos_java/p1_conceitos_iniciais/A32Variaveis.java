package com.emerson.courses.softblue.fundamentos_java.p1_conceitos_iniciais;

public class A32Variaveis {

  public static void main(String[] args) {

    /*
     * Variáveis
     * Java não inicia variaveis de forma automática;
     */

    /* Inteiro */
    int numero;
    numero = 50;

    /* Outra forma de declarar */
    int numero2 = 51;

    int numero3 = numero2 + 5;

    numero3 -= 1;

    System.out.println(numero);
    System.out.println(numero2);
    System.out.println(numero3);

    /* Operação de tipos diferentes terão resultado no tipo mais abrangente; */
    // int i = 10L + 5; // Erro
    long i = 10L + 5;
    System.out.println(i);

    // Resultado será double
    double d = 5 * 2.0;
    System.out.println(d);

    // NaN de responsta por ser double, se fosse int geraria uma exceção
    double j = 0.0 / 0;
    System.out.println(j);

    // Exceção gerada -> java.lang.ArithmeticException: / by zero
    int o = 0 / 0;
    System.out.println(o);

    // Infinity de resposta
    double l = 10.0 / 0;
    System.out.println(l);

    /*
     * Variáveis do tipo
     * var
     */

  }

}
