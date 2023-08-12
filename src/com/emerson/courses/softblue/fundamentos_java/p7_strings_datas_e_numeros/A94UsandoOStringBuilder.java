package com.emerson.courses.softblue.fundamentos_java.p7_strings_datas_e_numeros;

public class A94UsandoOStringBuilder {

  public static void main(String[] args) {

    /*
     * String s = "";
     * 
     * for (int i = 0; i < 1000; i++) {
     * s = s + "X";
     * }
     * 
     * System.out.println(s);
     */

    StringBuilder sb = new StringBuilder();

    for (int i = 0; i < 1000; i++) {
      sb.append("x");
    }

    String s = sb.toString();

    System.out.println(s);

  }

}
