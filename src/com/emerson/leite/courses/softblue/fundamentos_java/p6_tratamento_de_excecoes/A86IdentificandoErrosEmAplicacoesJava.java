package com.emerson.leite.courses.softblue.fundamentos_java.p6_tratamento_de_excecoes;

public class A86IdentificandoErrosEmAplicacoesJava {

  public static void main(String[] args) {

    ContatoPF c1 = new ContatoPF();
    // Endereco e = new Endereco();

    c1.setNome("Emerson");
    c1.setCpf("632.632.856-32");
    // c1.setEndereco(e);
    // ou
    // c1.setEndereco(new Endereco());

    c1.getEndereco().setRua(("Rua das Carmelas"));
    c1.getEndereco().setNumero("100");
    c1.getEndereco().setCidade("Ribeirão das Neves");
    c1.getEndereco().setEstado("Paranoca");

    System.out.println(c1.getEndereco().getCidade());

    Agenda agendaC1 = new Agenda();

    agendaC1.setContato1(c1);

    imprimirNomes(agendaC1);

    System.out.println("Contato definido");

    imprimirCnpj(agendaC1);

  }

  private static void imprimirNomes(Agenda a) {
    /* Verificacoes que evitam o NullPointerException */
    if (a.getContato1() != null)
      System.out.println(a.getContato1().getNome());
    if (a.getContato2() != null)
      System.out.println(a.getContato2().getNome());
    if (a.getContato3() != null)
      System.out.println(a.getContato3().getNome());
  }

  /*
   * Código abaixo gera ClassCastException, pois se tentar fazer um casting de
   * ContatoPF para ContatoPJ
   */
  private static void imprimirCnpj(Agenda a) {

    /* if (a.getContato1() != null) { */
    if (a.getContato1() != null && a.getContato1() instanceof ContatoPJ) { // Modificacao para corrigir o erro
      ContatoPJ c = (ContatoPJ) a.getContato1();
      System.out.println(c.getCnpj());
    }

    if (a.getContato2() != null) {
      ContatoPJ c = (ContatoPJ) a.getContato2();
      System.out.println(c.getCnpj());
    }

    if (a.getContato3() != null) {
      ContatoPJ c = (ContatoPJ) a.getContato3();
      System.out.println(c.getCnpj());
    }

  }
}
