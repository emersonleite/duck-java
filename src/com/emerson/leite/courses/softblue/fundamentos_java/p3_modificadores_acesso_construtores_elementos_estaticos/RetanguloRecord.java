package com.emerson.leite.courses.softblue.fundamentos_java.p3_modificadores_acesso_construtores_elementos_estaticos;

public record RetanguloRecord(double largura, double altura) {

  /* Construtor para o record */
  public RetanguloRecord() {

    this(4, 3);

    // ou
    /*
     * this.largura = 4;
     * this.altura = 3;
     */
  }

  public double calcularArea() {
    return largura * altura;
  }

  /* Pode-se agregar com métodos estáticos */
  public static RetanguloRecord create(double lado) {
    return new RetanguloRecord(lado, lado);
  }

}
