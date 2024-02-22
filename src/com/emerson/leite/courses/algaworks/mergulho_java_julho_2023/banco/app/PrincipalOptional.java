package com.emerson.leite.courses.algaworks.mergulho_java_julho_2023.banco.app;

import com.emerson.leite.courses.algaworks.mergulho_java_julho_2023.banco.modelo.Banco;
import com.emerson.leite.courses.algaworks.mergulho_java_julho_2023.banco.modelo.Conta;
import com.emerson.leite.utils.Mostrar;

import java.math.BigDecimal;
import java.util.Optional;

public class PrincipalOptional {

  public static void main(String[] args) {

    Banco banco = new Banco();

    Mostrar.titulo("Conta encontrada: ");
    Optional<Conta> contaEncontrada = banco.buscar(123, 222);
    /* Necessário obtar a conta de Optional<Conta> contaEncontrada com get() */
    System.out.println(contaEncontrada.get().getSaldo());

    Mostrar.titulo("Caso de exceção, pois não foi encontrada a conta: ");
    Optional<Conta> contaNaoEncontrada = banco.buscar(333, 222);
    /*
     * Idem acima para obter a conta, e verificando se existe conta com isPresent()
     */
    if (contaNaoEncontrada.isPresent()) {
      System.out.println(contaNaoEncontrada.get().getSaldo());
    } else {
      System.out.println("Nada aqui ... :(");
    }

    Mostrar.titulo("Caso de exceção, pois não foi encontrada a conta (opção abreviada): ");
    contaNaoEncontrada.ifPresent(conta -> System.out.println(conta.getSaldo()));

    Mostrar.titulo("Caso de exceção, mas com retorno de um valor para saldo, nesse caso zerado ");
    BigDecimal saldo = banco.buscar(123, 333).map(Conta::getSaldo).orElse(BigDecimal.ZERO);
    System.out.println(saldo);

    Mostrar.titulo("Caso de exceção, pois não foi encontrada a conta e lançando exceção: ");
    Conta contaNaoEncontradaComExcecao = banco.buscar(333, 222)
        .orElseThrow(() -> new RuntimeException("Conta não encontrada. Lançando exceção"));

    System.out.println(contaNaoEncontradaComExcecao.getSaldo());

  }

}
