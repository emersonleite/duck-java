package com.emerson.courses.algaworks.banco.app;

import com.emerson.courses.algaworks.banco.modelo.Pessoa;
import com.emerson.utils.Mostrar;

import java.util.HashSet;
import java.util.Set;

public class PrincipalCollectionsSet {

  public static void main(String[] args) {

    Pessoa pessoa1 = new Pessoa("Emerson Leite", "856325963");
    Pessoa pessoa2 = new Pessoa("Mariana Leite", "856325677");

    System.out.println(pessoa1);

    /*
     * SET herda da interface COLLECTION;
     * Conjuntos (SET) não aceitam elementos duplicados;
     * Não possuem índices;
     * Garantia de elementos únicos;
     * Não garantia de ordem conforme inserção dos elementos;
     * HashSet trabalha com conceito de tabelas de espalhamento para facilitar a
     * busca de elementos. Cada elemento a ser procurado tem um hash.
     */

    Set<Pessoa> pessoas = new HashSet<>();

    pessoas.add(pessoa1);
    pessoas.add(pessoa2);

    /* Mostrando elementos */
    Mostrar.titulo("Mostrando elementos:");
    System.out.println(pessoas.toString());

    Mostrar.titulo("Interando sobre conjuntos:");
    for (Pessoa pessoa : pessoas) {
      System.out.println(pessoa.getNome());
    }

    /* Verificando se o conteúdo dos objetos são iguais */
    /*
     * Mesmo redefinido o equals, para HashSet não funciona
     * Necessário redefinir, nesse caso o hashCode
     */
    Mostrar.titulo("Verificando se pessoas cont\u00E9m pessoa4");
    Pessoa pessoa4 = new Pessoa("Emerson Leite", "856325963");
    boolean pessoaExiste = pessoas.contains(pessoa4);
    System.out.println(pessoaExiste);
  }
}
