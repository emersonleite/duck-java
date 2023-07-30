package com.emerson.courses.algaworks.mergulho_java_julho_2023.banco.app;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.stream.Stream;
import java.util.List;

import com.emerson.courses.algaworks.mergulho_java_julho_2023.banco.modelo.Banco;
import com.emerson.courses.algaworks.mergulho_java_julho_2023.banco.modelo.Conta;
import com.emerson.courses.algaworks.mergulho_java_julho_2023.banco.modelo.Pessoa;
import com.emerson.utils.Mostrar;

public class PrincipalStreamsApi {

  public static void main(String[] args) {

    /*
     * Api de STREAMS API possita trabalho com dados de maneira mais fácil
     * Possibilita o uso de expressões LAMBDA
     * Ele não duplica a fonte de dados
     * Trabalha como camada para acesso à fonte de dados;
     * Ele não muda a fonte de dados
     * Uma operação terminal, p. ex. forEach, faz a pipeline de operações da stream
     * ser executada
     * Operação do tipo map retorna uma nova stream
     */

    Banco banco = new Banco();
    Banco banco2 = new Banco();
    Banco banco3 = new Banco();
    Banco banco4 = new Banco();
    Banco banco5 = new Banco();

    Mostrar.titulo("Contas mostradas com stream com depósito");
    Stream<Conta> stream = banco.getContas().stream();
    /* Depositando em cada conta */
    stream.forEach(conta -> {
      conta.depositar(new BigDecimal("20"));
      System.out.println(conta.getAgencia() + " / " + conta.getNumero() + " = " + conta.getSaldo());
    });

    /* Usando stream para filtrar elementos */
    Mostrar.titulo("Contas filtradas com stream");

    Stream<Conta> stream2 = banco.getContas().stream();

    Stream<Conta> stream3 = stream2.filter(conta -> conta.getSaldo().compareTo(new BigDecimal("140")) > 0);
    stream3.forEach(conta -> {
      System.out.println(conta.getAgencia() + " / " + conta.getNumero() + " = " + conta.getSaldo());
    });

    /* Encadeando operações - a fonte de dados não é alterada */
    Mostrar.titulo("Filtro com encadeamento de operações:");
    banco2.getContas().stream()
        .filter(conta -> conta.getSaldo().compareTo(new BigDecimal("50")) > 0)
        .filter(conta -> conta.getNumero() > 200)
        .sorted(Comparator.comparingInt(Conta::getNumero))
        .forEach(conta -> {
          System.out.println(conta.getAgencia() + " / " + conta.getNumero() + " = " + conta.getSaldo());
        });

    Mostrar.titulo("Trabalhando com os titulares das contas:");
    banco3.getContas().stream()
        .filter(conta -> conta.getSaldo().compareTo(new BigDecimal("50")) > 0)
        .filter(conta -> conta.getNumero() > 200)
        .map(Conta::getTitular)
        .forEach(titular -> {
          System.out.println(titular);
        });

    Mostrar.titulo("Trabalhando com os titulares das contas (simplificado) e sem duplicatas:");
    banco3.getContas().stream()
        .filter(conta -> conta.getSaldo().compareTo(new BigDecimal("50")) > 0)
        .filter(conta -> conta.getNumero() > 200)
        .map(Conta::getTitular)
        .distinct()
        .forEach(System.out::println);

    Mostrar.titulo("Somando valores com reduce");
    BigDecimal saldoTotal = banco4.getContas().stream()
        .map(Conta::getSaldo)
        .reduce(BigDecimal.ZERO, BigDecimal::add);
    System.out.println(saldoTotal);

    Mostrar.titulo("Obtendo lista de pessoas com collect a partir de um stream:");
    List<Pessoa> titulares = banco5.getContas().stream()
        .map(Conta::getTitular)
        .distinct()
        /* .collect(Collectors.toList()) */
        .toList();

    System.out.println(titulares);

  }
}
