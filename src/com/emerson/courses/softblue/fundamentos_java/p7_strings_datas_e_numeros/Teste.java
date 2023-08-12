package com.emerson.courses.softblue.fundamentos_java.p7_strings_datas_e_numeros;

public class Teste {

  public static void main(String[] args) {

    /*
     * Duration d = Duration.of(45, ChronoUnit.MINUTES);
     * LocalDateTime ldt1 = LocalDateTime.of(2020, Month.MAY, 5, 16, 0);
     * LocalDateTime ldt2 = ldt1.plus(d);
     * String s = ldt2.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
     * System.out.println(s);
     */

    StringBuilder sb1 = new StringBuilder("abc");
    StringBuilder sb2 = sb1;
    sb1.append("d");
    System.out.println(sb1 + " " + sb2 + " " + (sb1 == sb2));
  }

}
