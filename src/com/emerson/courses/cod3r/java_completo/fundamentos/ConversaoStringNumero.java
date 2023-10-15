package com.emerson.courses.cod3r.java_completo.fundamentos;

import javax.swing.*;

public class ConversaoStringNumero {

    public static void main(String[] args) {

        // JOptionPane para mostrar um modal
        String valor1 = JOptionPane.
                showInputDialog("Digite o primeiro numero");

        String valor2 = JOptionPane.
                showInputDialog("Digite o primeiro numero");

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double soma = numero1 + numero2;

        System.out.println("A soma é " + soma);
        System.out.println("A média é " + soma / 2);
    }
}
