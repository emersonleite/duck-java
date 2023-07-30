package com.emerson.courses.algaworks.banco.modelo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Pessoa {
  private String nome;
  private String documento;
  private BigDecimal rendimentoAnual; /* Ao lado utiliza-se uma classe WRAPPER para double */
  private TipoPessoa tipo = TipoPessoa.FISICA; /* Usando ENUM - enumerações */
  private LocalDateTime dataUltimaAtualizacao = LocalDateTime.now();

  public Pessoa() {
  }

  public Pessoa(String nome, String documento) {
    this.nome = nome;
    this.documento = documento;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDocumento() {
    return documento;
  }

  public void setDocumento(String documento) {
    this.documento = documento;
  }

  public BigDecimal getRendimentoAnual() {
    return rendimentoAnual;
  }

  public void setRendimentoAnual(BigDecimal rendimentoAnual) {
    this.rendimentoAnual = rendimentoAnual;
  }

  public TipoPessoa getTipo() {
    return tipo;
  }

  public void setTipo(TipoPessoa tipo) {
    this.tipo = tipo;
  }

  public LocalDateTime getDataUltimaAtualizacao() {
    return dataUltimaAtualizacao;
  }

  public void setDataUltimaAtualizacao(LocalDateTime dataUltimaAtualizacao) {
    this.dataUltimaAtualizacao = dataUltimaAtualizacao;
  }

  /* toString sobrescrito */
  @Override
  public String toString() {
    return "Pessoa [nome=" + nome + ", documento=" + documento + ", tipo=" + tipo + "]";
  }

  /* hashCode e equals definidos pela IDE */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((documento == null) ? 0 : documento.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Pessoa other = (Pessoa) obj;
    if (documento == null) {
      if (other.documento != null)
        return false;
    } else if (!documento.equals(other.documento))
      return false;
    return true;
  }

  /* equals sobrescrito anteriormente */
  /*
   * @Override
   * public boolean equals(Object obj) {
   * 
   * if (this == obj)
   * return true;
   * if (obj == null)
   * return false;
   * if (this.getClass() != obj.getClass())
   * return false;
   * 
   * Pessoa pessoa = (Pessoa) obj;
   * 
   * return documento.equals(pessoa.documento);
   * }
   */

}
