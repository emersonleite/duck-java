package com.emerson.courses.cod3r.java_completo.fundamentos.classe_e_metodos;

public class Produto {

  /*
   * Construtor
   * Tem o nome da classe
   * Não tem retorno
   * Quando se definir um construtor perde-se o padrão
   */

  Produto(String nomeInicial) {
    nome = nomeInicial;
  }

  Produto(String nomeInicial, double precoInicial) {
    nome = nomeInicial;
    preco = precoInicial;
  }

  /* Definindo o construtor padrão */
  Produto() {
  }

  String nome;
  double preco;
  double desconto;

  double precoComDesconto() {
    return preco * (1 - desconto);
  }

  double precoComDesconto(double descontoDoGerente) {
    return preco * (1 - (desconto + descontoDoGerente));
  }
  /*
   * @Override
   * public boolean equals(Object obj) {
   * Produto other = (Produto) obj;
   * return this.nome.equals(other.nome);
   * }
   */
}
