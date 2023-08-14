package com.emerson.courses.softblue.fundamentos_java.p8_enums_classes_wrappers_e_autoboxing;

public class A103EmbrulhandoTiposPrimitivosComAsClassesWrappers {

  public static void main(String[] args) {

    /* Classe para int */
    Integer i = Integer.valueOf(10);
    imprimir(i);

    Double d = Double.valueOf(26.6);
    imprimir(d);

    /* Obtendo o valor da classe wrapper */
    int i2 = i.intValue();
    System.out.println(i2);

    /* Criando valor a partir de uma string */
    Integer i3 = Integer.valueOf("1663");
    System.out.println(i3);

    /* Fazendo o parse para obter valores em tipos primitivos */
    int i4 = Integer.parseInt("20");
    System.out.println(i4);

    double d3 = Double.parseDouble("52.6");
    System.out.println(d3);

    /* Convertendo binário entrando com o tipo da base */
    String bin = "0111";
    int i5 = Integer.parseInt(bin, 2);
    System.out.println(i5);

    /*
     * Funciona pois acontece o autoboxing de um tipo primitivo em uma classe
     * wrapper
     */
    imprimir(100);

  }

  private static void imprimir(Object obj) {
    System.out.println(obj);
  }

}
