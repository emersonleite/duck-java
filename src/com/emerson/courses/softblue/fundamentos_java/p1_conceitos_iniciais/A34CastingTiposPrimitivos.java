
package com.emerson.courses.softblue.fundamentos_java.p1_conceitos_iniciais;

class A34CastingTiposPrimitivos {

  public static void main(String[] args) {

    /* Casting é alteração de tipo de dado */

    /* Não há casting */
    int x = 11;

    /* CASTING IMPLÍCITO, pois 10 é int e long é mais abrangente que int */
    long y = 10;

    /* Não há casting definindo como 12L */
    long z = 12L;

    /* CASTING IMPLÍCITO de int para double */
    double o = 35;

    /*
     * CASTING IMPLÍCITO não ocorre de double para float, pois double é mais
     * abrangente
     */

    /* Erro */
    // float t = 40.0;

    /* Necessário CASTING EXPLÍCITO */
    float t = (float) 40.0;
    /* Ou */
    t = 40.0F;

    /* Não houve CASTING, pois 100 pode ser short */
    short yu = 100;

    /*
     * Aqui é necessário fazer o CASTING EXPLÍCITO, mas o número não coube dentro de
     * short, e a saída foi -31072
     */
    short eo = (short) 100_000;

    /* Mesma problema aqui, pois 130 não cabe dentro de byte e a saída é -126 */
    byte b = (byte) 130;

    System.out.println(x);
    System.out.println(y);
    System.out.println(z);
    System.out.println(o); // 35.0
    System.out.println(t);
    System.out.println(yu);
    System.out.println(eo);
    System.out.println(b);

  }

}