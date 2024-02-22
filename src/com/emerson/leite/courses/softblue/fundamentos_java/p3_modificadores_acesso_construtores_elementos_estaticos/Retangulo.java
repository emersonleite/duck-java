package com.emerson.leite.courses.softblue.fundamentos_java.p3_modificadores_acesso_construtores_elementos_estaticos;

public class Retangulo {

  private double largura;
  private double altura;

  /* Toda classe sempre tem um parâmetro imbutido, mesmo que não definido */

  /* Construtor que não recebe parâmetros */
  public Retangulo() {
    // Chamando o construtor de passagem de parâmetros
    this(4, 3);

    // ou
    /* largura = 4; */
    /* altura = 3; */
  }

  /* Construtor com passagem de parâmetros */
  public Retangulo(double largura, double altura) {
    this.largura = largura;
    this.altura = altura;
  }

  public double calcularArea() {
    return largura * altura;
  }

}
