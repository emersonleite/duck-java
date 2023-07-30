package com.emerson.courses.algaworks.mergulho_java_julho_2023.banco.app;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.emerson.courses.algaworks.mergulho_java_julho_2023.banco.modelo.Conta;
import com.emerson.courses.algaworks.mergulho_java_julho_2023.banco.modelo.ContaEspecial;
import com.emerson.courses.algaworks.mergulho_java_julho_2023.banco.modelo.ContaInvestimento;
import com.emerson.courses.algaworks.mergulho_java_julho_2023.banco.modelo.Pessoa;
import com.emerson.courses.algaworks.mergulho_java_julho_2023.banco.modelo.atm.CaixaEletronico;
import com.emerson.courses.algaworks.mergulho_java_julho_2023.banco.modelo.excecao.SaldoInsuficienteException;
import com.emerson.courses.algaworks.mergulho_java_julho_2023.banco.modelo.pagamento.Boleto;
import com.emerson.courses.algaworks.mergulho_java_julho_2023.banco.modelo.pagamento.Holerite;

public class Principal {
    public static void main(String[] args) {

        Pessoa titular1 = new Pessoa();
        titular1.setNome("João da Silva");
        titular1.setDocumento("123456789");
        /* Autoboxing */
        titular1.setRendimentoAnual(new BigDecimal("15000"));
        /* OU titular1.setRendimentoAnual(Double.valueOf(15_000d)); */

        /* Autounboxing */
        BigDecimal rendimento = titular1.getRendimentoAnual();
        System.out.println(rendimento);

        /* Mostrando tipo de pessoa que está no enum */
        System.out.println(titular1.getTipo());

        /* Mostrando data e hora */
        titular1.setDataUltimaAtualizacao(LocalDateTime.parse("2023-06-27T13:20:00"));
        System.out.println(titular1.getDataUltimaAtualizacao());

        Pessoa titular2 = new Pessoa();
        titular2.setNome("Maria da Silva");
        titular2.setDocumento("123456788");

        System.out.println();
        // Utiliando o construtor customizado
        Conta minhaConta = new ContaInvestimento(titular1, 123, 987);
        minhaConta.depositar(new BigDecimal("30000"));
        minhaConta.sacar(new BigDecimal("1000")); // Sacar sem taxa
        minhaConta.sacar(new BigDecimal("1000"), new BigDecimal("20")); // Sacar com taxa
        System.out.println("Titular: " + minhaConta.getTitular().getNome());
        System.out.println("Saldo: " + minhaConta.getSaldo());

        System.out.println();
        // Utilizando o construtor padrão
        Conta suaConta = new ContaInvestimento(titular2, 222, 333);
        suaConta.depositar(new BigDecimal("30000"));
        System.out.println("Titular: " + suaConta.getTitular().getNome());
        System.out.println("Saldo: " + suaConta.getSaldo());

        System.out.println();
        // Conta investimento herda de conta
        ContaInvestimento minhaContaInvestimento = new ContaInvestimento(titular1, 123, 987);
        minhaContaInvestimento.depositar(new BigDecimal("30000"));
        minhaContaInvestimento.sacar(new BigDecimal("1000"));
        minhaContaInvestimento.creditarRendimentos(new BigDecimal("0.8"));
        minhaContaInvestimento.debitarTarifasMensal();
        System.out.println("Conta Investimento:");
        System.out.println("Saldo: " + minhaContaInvestimento.getSaldo());

        System.out.println();
        // Conta especial herda de conta
        ContaEspecial minhaContaEspecial = new ContaEspecial(titular1, 123, 987, new BigDecimal("1000"));
        minhaContaEspecial.depositar(new BigDecimal("15000"));
        minhaContaEspecial.sacar(new BigDecimal("15500"));
        minhaContaEspecial.sacar(new BigDecimal("400"));
        minhaContaEspecial.debitarTarifasMensal();
        System.out.println("Conta Especial:");
        System.out.println("Saldo: " + minhaContaEspecial.getSaldo());

        // ---------------------------------------------------------------------------------

        // UPCASTING - subtipo para supertipo
        // Conta contaUpcastingExemplo1 = minhaConta; // ou // Conta contaUp = (Conta)
        // minhaConta;

        // OU
        // Mas conta contaUp2 não tem acesso a métodos de conta investimento
        // Conta contaUpcastingExemplo2 = new ContaInvestimento(titular2, 123, 456);

        // ---------------------------------------------------------------------------------

        /*
         * UPCASTING sendo utilizado ao passar objetos dos tipos ContaEspecial e
         * ContaInvestimento em parâmetro que aceita Conta - conceito de 'POLIMORFISMO'
         */

        CaixaEletronico caixaEletronico = new CaixaEletronico();

        System.out.println();
        System.out.println("Saldo conta especial: ");
        caixaEletronico.imprimirSaldo(minhaContaEspecial);

        System.out.println();
        System.out.println("Saldo conta investimento: ");
        caixaEletronico.imprimirSaldo(minhaContaInvestimento);

        /* Pagando boleto */
        System.out.println();
        Boleto boletoEscola = new Boleto(titular1, new BigDecimal("1000"));
        caixaEletronico.pagar(boletoEscola, minhaContaInvestimento);
        System.out.println("Boleto pago: " + boletoEscola.estaPago());

        /* Mostrando saldo após pagamento de boleto */
        System.out.println();
        System.out.println("Saldo conta investimento: ");
        caixaEletronico.imprimirSaldo(minhaContaInvestimento);

        /* Pagando boleto */
        System.out.println();
        Holerite salarioFuncionario = new Holerite(titular1, new BigDecimal("100"), 160);
        caixaEletronico.pagar(salarioFuncionario, minhaContaInvestimento);
        System.out.println("Salário pago: " + salarioFuncionario.estaPago());

        /* Mostrando saldo após pagamento de salário */
        System.out.println();
        System.out.println("Saldo conta investimento: ");
        caixaEletronico.imprimirSaldo(minhaContaInvestimento);

        /* Estornando boleto */
        System.out.println();
        System.out.println("Estornando boleto ...");
        caixaEletronico.estornarPagamento(boletoEscola, minhaContaInvestimento);

        /* Mostrando saldo após pagamento de salário */
        System.out.println();
        System.out.println("Saldo conta investimento após estorno de boleto: ");
        caixaEletronico.imprimirSaldo(minhaContaInvestimento);

        /* Imprimindo recibos */
        System.out.println();
        System.out.println("Recibo salário");
        salarioFuncionario.imprimirRecibo();

        System.out.println();
        System.out.println("Recibo boleto");
        boletoEscola.imprimirRecibo();

        /* Tratando exceções, emitindo mensagens */
        System.out.println();
        try {
            minhaContaEspecial.sacar(new BigDecimal("50000"));
        } catch (SaldoInsuficienteException e) {
            System.out.println("Erro ao executar operação na conta: " + e.getMessage());
        }

        /*
         * Pode se tratar exceções mais genéricas considerando classes acima. Deve-se
         * usar com moderação, para se tratar exceções por tipo.
         */
        System.out.println();
        try {
            minhaContaInvestimento.sacar(new BigDecimal("50000"));
        } catch (Exception e) {
            System.out.println("Erro ao executar operação na conta: " + e.getMessage());
        }

    }
}
