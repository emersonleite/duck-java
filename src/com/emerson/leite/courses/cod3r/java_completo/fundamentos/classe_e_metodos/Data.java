package com.emerson.leite.courses.cod3r.java_completo.fundamentos.classe_e_metodos;

public class Data {
  int dia;
  int mes;
  int ano;

  Data(int dia, int mes, int ano) {
    // this permite acesso aos atributos da que pertencer à instância (objeto)
    this.dia = dia;
    this.mes = mes;
    this.ano = ano;
  }

  Data() {
    // abaixo this chama o construtor com parâmetros
    this(1, 1, 1970);
  }

  String obterDataFormatada() {
    return String.format("%d/%d/%d", dia, mes, ano);
  }

  void imprimirDataFormatada() {
    System.err.println(obterDataFormatada());
  }
}
