package com.emerson.courses.softblue.fundamentos_java.p7_strings_datas_e_numeros;

public class A93TrabalhandoComStrings {

  public static void main(String[] args) {

    /*
     * String é uma classe;
     * São imutáveis;
     * Quando sõa manipuladas outros objetos são criado com o resultado da
     * manipulacao;
     */

    /* Forma 1, criando um novo objeto na memória */
    String s1 = new String("abc");
    /* Forma 2 */
    String s2 = "abc";
    String s3 = "abc";

    System.out.println(s1);
    System.out.println(s2);

    /* False -> aqui se compara enderecos (objetos) de memória e não valores */
    System.out.println(s1 == s2);

    /*
     * True -> pois string foram inicializadas com igualdade, e s2 e s3 apontam para
     * mesmo objeto na memória, que está num poll de strings
     */
    System.out.println(s2 == s3);

    /* True -> aqui se compara conteúdo. Método mais consistente para comparacao */
    System.out.println(s1.equals(s2));

    /* Reatribuicao de valor, sem mudanca na string original */
    s2 = s2.toUpperCase();

    System.out.println(s2);

  }

}
