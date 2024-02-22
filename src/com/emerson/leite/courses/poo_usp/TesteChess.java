package com.emerson.leite.courses.poo_usp;

public class TesteChess {
  public static void main(String[] args) {

    ChessBoard tabuleiro = ChessBoard.getInstance();

    ChessBoard tabuleiro2 = ChessBoard.getInstance();

    System.out.println(tabuleiro);

    System.out.println(tabuleiro2);
  }
}
