package com.emerson.courses.softblue.fundamentos_java.p4_heranca_e_polimorfismo;

import com.emerson.courses.algaworks.utils.Mostrar;

public class A62AplicandoHerançaEntreClassesNoJava {

  /*
   * Todas as classes herdam de Object;
   * Não existe herança multipla em Java;
   * Podem ser definidos métodos específicos na subclasse;
   * Assim como podem ser definidos atributos específicos da classe;
   */

  public static void main(String[] args) {

    Mostrar.titulo("Veiculo");
    Veiculo v = new Veiculo();
    v.setAno(2000);
    v.setMarca("AAA");
    v.setModelo("BBB");

    // v.buzinar();
    // v.imprimirDados();

    Mostrar.titulo("Carro");
    Carro c1 = new Carro();
    c1.setAno(2000);
    c1.setMarca("gfd");
    c1.setModelo("erg");
    c1.setQuatroPortas(true);
    c1.imprimirDados();

    // c1.buzinar();

    Mostrar.titulo("Motocicleta");
    Motocicleta m1 = new Motocicleta();
    m1.setAno(2010);
    m1.setMarca("ret");
    m1.setModelo("yui");
    m1.imprimirDados();
    // m1.buzinar();
    // m1.empinar();

    Mostrar.titulo("Caminhão");
    Caminhao ca = new Caminhao();
    ca.buzinar();

  }

}
