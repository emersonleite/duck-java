package com.emerson.courses.cod3r.java_completo.fundamentos.classe_e_metodos;

public class ValorVsReferencia {

  public static void main(String[] args) {

    double a = 2;
    double b = a; // Atribuição por valor

    System.err.println(a++);
    System.out.println(b--);

    Data d1 = new Data(1, 10, 2023);

    Data d2 = d1; // Atribuição por referência

    d2.ano = 2024;

    d1.imprimirDataFormatada();
    d2.imprimirDataFormatada();

    voltarDataParaValorPadrao(d2);

    d1.imprimirDataFormatada();
    d2.imprimirDataFormatada();

    int c = 5;
    alterarPrimitivo(5);
    System.out.println(c); // continua sendo 5, pois o valor é passado como cópia

  }

  // Um método estático só consegue acessar outro método estático
  static void voltarDataParaValorPadrao(Data d) {
    d.dia = 1;
    d.mes = 1;
    d.ano = 1970;
  }

  static void alterarPrimitivo(int a) {
    a++;
  }

}
