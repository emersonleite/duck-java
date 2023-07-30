package com.emerson.courses.softblue.fundamentos_java.p4_heranca_e_polimorfismo.e2;

import com.emerson.utils.Mostrar;

/*
  * 2 Exercício
  * Crie uma classe Veiculo com um atributo ligado (privado), que indica se o
  * carro está ligado
  * ou não. Esta classe deve ter também os métodos ligar() e desligar(), que
  * definem o valor
  * para este atributo, e um método getter (isLigado()).
  * Depois crie três subclasses de Veiculo: Automovel, Motocicleta e Onibus. Cada
  * classe
  * destas deve sobrescrever os métodos ligar() e desligar() e deve imprimir
  * mensagens
  * como “Automóvel ligado”, “Motocicleta desligada”, etc. Para manter a
  * consistência do modelo,
  * descubra como fazer para que o atributo ligado de Veiculo tenha o valor
  * correto quando os
  * métodos são chamados.
  * Crie uma aplicação que instancia três veículos, um de cada tipo, e chama os
  * métodos ligar(),
  * desligar() e isLigado(). O resultado obtido deve ser consistente com o que o
  * modelo
  * representa. Por exemplo, ao chamar o método ligar() de um Automovel, é
  * esperado que o
  * método isLigado() retorne true.
  */

public class Principal {

  public static void main(String[] args) {

    Mostrar.titulo("Automóvel");

    Automovel a1 = new Automovel();

    a1.ligar();
    System.out.println(a1.isLigado());

    a1.desligar();
    System.out.println(a1.isLigado());

    Mostrar.titulo("Ônibus");

    Automovel o1 = new Automovel();

    o1.ligar();
    System.out.println(o1.isLigado());

    o1.desligar();
    System.out.println(o1.isLigado());

  }

}
