package com.emerson.courses.softblue.fundamentos_java.p2_classes_e_objetos;

public class A44PassagemDeParametros {

  public static void main(String[] args) {

    /* A passagem de parâmetros é por cópia */
    Operacao op = new Operacao();

    /* Por isso essa troca não é realizada */
    int x = 10;
    op.trocar(x);
    System.out.println(x);

    /* Aqui o valor é alterado */
    Valor valor = new Valor();
    valor.v = 10;
    op.alterarValor(valor);

    System.out.println(valor.v);

  }

}
