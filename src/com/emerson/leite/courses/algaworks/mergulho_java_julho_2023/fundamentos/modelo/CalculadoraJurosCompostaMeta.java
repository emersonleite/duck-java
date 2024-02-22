package com.emerson.leite.courses.algaworks.mergulho_java_julho_2023.fundamentos.modelo;

public class CalculadoraJurosCompostaMeta {

  public static void main(String[] args) {

    double valorAcumulado = 10_000;
    double valorMeta = 20_000;
    double taxaJurosMensal = 0.9;
    int mes = 1;

    while (valorAcumulado < valorMeta) {

      valorAcumulado += valorAcumulado * taxaJurosMensal / 100;

      System.out.println("Mês " + mes + " = " + valorAcumulado);

      mes++;
    }
  }

}
