package com.emerson.courses.algaworks.banco.app;

import com.emerson.courses.algaworks.banco.modelo.Pessoa;
import com.emerson.courses.algaworks.utils.Mostrar;

import java.util.ArrayList;
import java.util.List;

public class PrincipalCollectionsList {

  public static void main(String[] args) {

    Pessoa pessoa1 = new Pessoa("Emerson Leite", "856325963");
    Pessoa pessoa2 = new Pessoa("Mariana Leite", "856325677");

    System.out.println(pessoa1);

    /*
     * String que representa o objeto, utiliza-se o método toString padrão:
     * com.emerson.courses.algaworks.banco.modelo.Pessoa@15db9742
     * 
     * O toString pode ser sobrescrito:
     * Pessoa [nome=Emerson Leite, documento=856325963, tipo=FISICA]
     */

    /*
     * Definindo a lista, onde LIST é interface e ArrayList é a classe
     * Não becessário colocar o tipo em ArrayList já que é inferido de List<Pessoa>
     */
    List<Pessoa> pessoas = new ArrayList<>();

    pessoas.add(pessoa1);
    pessoas.add(pessoa2);

    /* Mostrando elementos */
    System.out.println(pessoas.toString());

    /* Mostrando pessoa conforme índice */
    System.out.println();
    Pessoa pessoa3 = pessoas.get(1);
    System.out.println(pessoa3);

    /* Interando sobre a lista */
    System.out.println();
    for (int i = 0; i < pessoas.size(); i++) {
      System.out.println(pessoas.get(i).getNome());
    }

    /* Oura forma de interar */
    System.out.println();
    for (Pessoa pessoa : pessoas) {
      System.out.println(pessoa.getNome());
    }

    /* Verificando se o conteúdo dos objetos são iguais */
    Mostrar.titulo("Verificando se pessoas cont\u00E9m pessoa4");
    Pessoa pessoa4 = new Pessoa("Emerson Leite", "856325963");
    boolean pessoaExiste = pessoas.contains(pessoa4);
    System.out.println(pessoaExiste); // Retorna false se utilzar metodos equals padrão, true se for sobrescrito, pois
                                      // contains utiliza o método equals

    Mostrar.titulo("Verificando se pessoas contém pessoa1");
    pessoaExiste = pessoas.contains(pessoa1);
    System.out.println(pessoaExiste); // Retorna true

    /* Comparando objetos com equals */
    Mostrar.titulo("Comparando referencias a objetos com com equals");
    System.out.println(pessoa1.equals(pessoa4)); // false se utilzar metodos equals padrão, true se for sobrescrito

    /*
     * Comparando referências a objetos (endereços de memória), utiliza-se == , não
     * se utiliza equals (a não ser que esse seja sobrescrito)
     */
    Mostrar.titulo("Comparando referencias a objetos com ==");
    Pessoa pessoa5 = pessoa1;
    System.out.println(pessoa1 == pessoa5); // true

  }
}
