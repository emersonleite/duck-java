package com.emerson.leite.courses.algaworks.mergulho_java_julho_2023.fundamentos.modelo;

// Nome de classes em Maiúsculo
// Nome da classe é o nome do arquivo
// Ponto e vírgula é obrigatório

/* Exemplo de comentário
 * com várias linhas
 */

public class OlaMergulhador {
  public static void main(String[] args) {
    System.out.println("Olá mergulhador");

    String nomeCompleto;
    // Ou
    // String nomeCompleto = "Emerson Leite";
    nomeCompleto = "Emerson Leite";

    System.out.println("Nome: " + nomeCompleto);

    int minhaIdade = 41;

    int suaIdade = 25;

    int totalIdades = minhaIdade + suaIdade;

    System.out.println("Minha idade é: " + totalIdades);

    double peso = 85.9d; // d é opcional

    System.out.println(peso);

    float taxa = 1_294.93f; // Definindo que é um float e não double

    System.out.println(taxa);

    boolean compraAprovada = false;

    System.out.println(compraAprovada);

  }
}
