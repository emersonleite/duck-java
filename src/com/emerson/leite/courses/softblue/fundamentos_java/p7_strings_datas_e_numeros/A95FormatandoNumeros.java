package com.emerson.leite.courses.softblue.fundamentos_java.p7_strings_datas_e_numeros;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class A95FormatandoNumeros {
  public static void main(String[] args) {

    double d = 1415.4;

    /* Sem locale explícito */
    NumberFormat nf1 = NumberFormat.getNumberInstance();
    String s1 = nf1.format(d);
    System.out.println(s1);

    /* Com locale -> "pt", "BR" */
    NumberFormat nf2 = NumberFormat.getNumberInstance(new Locale("pt", "BR"));
    String s2 = nf2.format(d);
    System.out.println(s2);

    /* Para padrão de moeda -> "pt", "BR" */
    NumberFormat nf3 = NumberFormat.getCurrencyInstance(new Locale("pt", "BR"));
    String s3 = nf3.format(d);
    System.out.println(s3);

    /* Para padrão de moeda -> "en", "US" */
    NumberFormat nf4 = NumberFormat.getCurrencyInstance(new Locale("en", "US"));
    String s4 = nf4.format(d);
    System.out.println(s4);

    /* Formatando com uma máscara do tipo '00000.000' */
    DecimalFormat df1 = new DecimalFormat("00,000.000");
    df1.setGroupingUsed(true);
    DecimalFormatSymbols dfs = new DecimalFormatSymbols();
    dfs.setDecimalSeparator('-');
    df1.setDecimalFormatSymbols(dfs);
    String s5 = df1.format(d);
    System.out.println(s5);

  }
}
