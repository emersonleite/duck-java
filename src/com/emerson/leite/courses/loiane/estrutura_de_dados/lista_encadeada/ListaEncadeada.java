package com.emerson.leite.courses.loiane.estrutura_de_dados.lista_encadeada;

public class ListaEncadeada<T> {

  private No<T> inicio;
  private No<T> ultimo;
  private int tamanho = 0;

  public void add(T elemento) {
    No<T> celula = new No<T>(elemento);

    if (tamanho == 0) {
      this.inicio = celula;
    } else {
      this.ultimo.setProximo(celula);
    }

    this.ultimo = celula;
    this.tamanho++; // Contando na inserção
  }

  public void limparLista() {

    for (No<T> atual = this.inicio; atual != null;) {
      No<T> proximo = atual.getProximo();
      atual.setElemento(null);
      atual.setProximo(null);
      atual = proximo;
    }

    this.inicio = null;
    this.ultimo = null;
    this.tamanho = 0;
  }

  public int obterTamanho() {
    return this.tamanho;
  }

  @Override
  public String toString() {

    if (this.tamanho == 0) {
      return "[]";
    }

    StringBuilder builder = new StringBuilder("[");

    No<T> atual = this.inicio;

    for (int i = 0; i < this.tamanho - 1; i++) {
      builder.append(atual.getElemento()).append(",");
      atual = atual.getProximo();
    }
    builder.append(atual.getElemento()).append("]");

    /* Versão com while */
    /*
     * builder.append(atual.getElemento()).append(",");
     * while (atual.getProximo() != null) {
     * atual = atual.getProximo();
     * builder.append(atual.getElemento()).append(",");
     * }
     */

    return builder.toString();
  }
}
