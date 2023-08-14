package com.emerson.courses.softblue.fundamentos_java.p8_enums_classes_wrappers_e_autoboxing;

public class A102CriandoEnums {

  private enum Sexo {
    MASCULINO, FEMININO
  }

  public static void main(String[] args) {

    DiaDaSemana hoje = DiaDaSemana.SEXTA;

    /* Obtendo o valor do enum */
    int num = DiaDaSemana.QUARTA.getNum();

    System.out.println(hoje);
    System.out.println(num);

    String s = "TERCA";

    /* Tentando obter um enum com base em um string */
    DiaDaSemana d = DiaDaSemana.valueOf(s);
    System.out.println(d);

    /* Acessando internamente */
    Sexo sexo = A102CriandoEnums.Sexo.MASCULINO;

    System.out.println(Sexo.FEMININO);
    System.out.println(sexo);

  }
}
