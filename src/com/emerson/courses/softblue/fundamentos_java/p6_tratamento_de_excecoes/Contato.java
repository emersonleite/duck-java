package com.emerson.courses.softblue.fundamentos_java.p6_tratamento_de_excecoes;

public abstract class Contato {

  private String nome;
  private Endereco endereco;

  /*
   * public Contato() {
   * endereco = new Endereco();
   * }
   */

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  /* Forma de evita o NullPointerException */
  public Endereco getEndereco() {
    if (endereco == null) {
      endereco = new Endereco();
    }
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

}
