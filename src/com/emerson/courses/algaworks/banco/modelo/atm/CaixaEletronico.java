package com.emerson.courses.algaworks.banco.modelo.atm;

import com.emerson.courses.algaworks.banco.modelo.Conta;
import com.emerson.courses.algaworks.banco.modelo.pagamento.DocumentoEstornavel;
import com.emerson.courses.algaworks.banco.modelo.pagamento.DocumentoPagavel;

public class CaixaEletronico {
  /*
   * UPCASTING sendo utilizado ao passar objetos dos tipos ContaEspecial e
   * ContaInvestimento em parâmetro que aceita Conta - conceito de 'POLIMORFISMO'
   */
  public void imprimirSaldo(Conta conta) {
    System.out.println("Conta: " + conta.getAgencia() + "/" + conta.getNumero());
    System.out.println("Titular: " + conta.getTitular().getNome());
    System.out.println("Saldo: " + conta.getSaldo());
    System.out.println("Saldo disponível: " + conta.getSaldoDisponivel());
  }

  public void pagar(DocumentoPagavel documento, Conta conta) {
    if (documento.estaPago()) {
      throw new IllegalStateException("Documento já está pago");
    }
    conta.sacar(documento.getValorTotal());
    documento.quitarPagamento();
  }

  public void estornarPagamento(DocumentoEstornavel documento, Conta conta) {
    if (!documento.estaPago()) {
      throw new IllegalStateException("Documento não está pago");
    }
    conta.depositar(documento.getValorTotal());
    documento.estornarPagamento();
  }

}
