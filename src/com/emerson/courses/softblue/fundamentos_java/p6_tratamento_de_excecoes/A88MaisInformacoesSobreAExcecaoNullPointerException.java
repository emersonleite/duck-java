package com.emerson.courses.softblue.fundamentos_java.p6_tratamento_de_excecoes;

public class A88MaisInformacoesSobreAExcecaoNullPointerException {

  public static void main(String[] args) {

    // Cidade c = null;
    Cidade c = new Cidade();

    /*
     * Para maiores detalhes configurar a VM
     * '-XX:+ShowCodeDetailsInExceptionMessages'
     */

    String nome = c.getEstado().getPais().getNome();

    System.out.println(nome);

  }

}
