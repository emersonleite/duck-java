package com.emerson.courses.algaworks.banco.app;

import java.util.Comparator;
import java.util.function.ToIntFunction;

import com.emerson.courses.algaworks.banco.modelo.Banco;
import com.emerson.courses.algaworks.banco.modelo.Conta;
import com.emerson.courses.algaworks.utils.Mostrar;

public class PrincipalInterfacesFuncionaisExpressoesLambda {

  public static void main(String[] args) {

    Banco banco = new Banco();
    Banco banco2 = new Banco();
    Banco banco3 = new Banco();

    /* Expressões LAMBDA */

    /* Definindo a expressão LAMBDA */

    ToIntFunction<Conta> function = (Conta conta) -> {
      return conta.getNumero();
    };

    /* Utilizando a expressão LAMBDA */
    Mostrar.titulo("Utilizando a expressão para ordenar por número de conta: ");
    banco.getContas().sort(Comparator.comparingInt(function));

    for (Conta conta : banco.getContas()) {
      System.out.println(conta.getAgencia() + " / " + conta.getNumero());
    }

    /* Utilizando a expressão LAMBDA de maneira simplificada */
    Mostrar.titulo("Utilizando a expressão para ordenar por número de conta (simplificado): ");
    banco2.getContas().sort(Comparator.comparingInt(conta -> conta.getNumero()));

    for (Conta conta : banco2.getContas()) {
      System.out.println(conta.getAgencia() + " / " + conta.getNumero());
    }

    /* Utilizando a expressão LAMBDA de maneira ainda mais simplificada :) :) :) */
    Mostrar.titulo("Utilizando a expressão para ordenar por número de conta (mais simplificado): ");
    banco3.getContas().sort(Comparator.comparingInt(Conta::getNumero));

    for (Conta conta : banco3.getContas()) {
      System.out.println(conta.getAgencia() + " / " + conta.getNumero());
    }
  }
}
