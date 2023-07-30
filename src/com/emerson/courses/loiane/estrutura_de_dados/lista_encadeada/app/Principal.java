package com.emerson.courses.loiane.estrutura_de_dados.lista_encadeada.app;

import com.emerson.courses.loiane.estrutura_de_dados.lista_encadeada.ListaEncadeada;

public class Principal {

  public static void main(String[] args) {
    ListaEncadeada<Integer> list = new ListaEncadeada<>();

    list.add(1);
    list.add(2);
    list.add(3);
    list.add(4);

    System.out.println(list);
    System.out.println("Tamanho: " + list.obterTamanho());

    list.limparLista();

    System.out.println(list);
    System.out.println("Tamanho: " + list.obterTamanho());
  }

}
