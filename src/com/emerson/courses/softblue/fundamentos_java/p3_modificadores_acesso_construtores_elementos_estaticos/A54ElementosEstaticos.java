package com.emerson.courses.softblue.fundamentos_java.p3_modificadores_acesso_construtores_elementos_estaticos;

public class A54ElementosEstaticos {

  public static void main(String[] args) {

    // Matematica m = new Matematica();

    /* Metódos estáticos não precisam de instanciação */
    int soma = Matematica.somar(10, 5);
    int subtracao = Matematica.subtrair(50, 10);

    System.out.println(soma);
    System.out.println(subtracao);

    /*
     * Contador c1 = new Contador();
     * Contador c2 = new Contador();
     * Contador c3 = new Contador();
     */

    /* Incrementa o valor em todas as instâncias do objeto */
    /*
     * System.out.println(c1.getValor());
     * System.out.println(c2.getValor());
     * System.out.println(c3.getValor());
     */

    System.out.println(Contador.getValor());

    Contador.incrementar();
    Contador.incrementar();
    Contador.incrementar();

    System.out.println(Contador.getValor());

    System.out.println(Constantes.MEDIA);

  }

}
