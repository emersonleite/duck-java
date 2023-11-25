package com.emerson.courses.cod3r.java_completo.fundamentos.classe_e_metodos;

public class ProdutoTeste {

  public static void main(String[] args) {

    Produto p1 = new Produto();
    p1.nome = "Notebook";
    p1.preco = 4356.25;
    p1.desconto = 0.25;

    Produto p2 = new Produto("Caneta Preta");
    p2.preco = 12.56;
    p2.desconto = 0.19;

    Produto p3 = new Produto("Caneta Azul", 15.00);
    p3.desconto = 0.19;

    System.out.println(p1.nome);
    System.out.println(p2.nome);
    System.out.println(p3.nome);

    System.out.println(p1.precoComDesconto());
    System.out.println(p2.precoComDesconto(0.19));

    System.out.println(p1.equals(p2));

    // System.out.println(p1.nome == p2.nome);

  }

}
