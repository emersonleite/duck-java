package com.emerson.leite.courses.softblue.fundamentos_java.p7_strings_datas_e_numeros;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class A96ManipulandoDatas {

  public static void main(String[] args) {

    // Date date = new Date();

    // long mili = date.getTime();

    /* Data atual do sistema */
    Calendar cal = Calendar.getInstance();

    /* Setando valores específicos */
    // cal.set(Calendar.YEAR, 2023);
    // cal.set(Calendar.MONTH, 1);

    /* Transformar Calendar para Date com getTime */
    cal.set(2023, 6, 5, 13, 30, 0);
    Date d = cal.getTime();
    System.out.println(d);

    /* Transformar Date para Calendar com setTime */
    // cal.setTime(d);

    /* Manipulando -> adicionando um ano */
    cal.add(Calendar.YEAR, 1);
    Date d2 = cal.getTime();
    System.out.println(d2);

    /* Manipulando -> subtraindo minutos */
    cal.add(Calendar.MINUTE, -30);
    Date d3 = cal.getTime();
    System.out.println(d3);

    /* Formatando a data -> formato curto */
    DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
    String f1 = df1.format(d);
    System.out.println(f1);

    /* Formatando a data -> formato médio */
    DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
    String f2 = df2.format(d);
    System.out.println(f2);

    /* Formatando a data -> formato longo, com locale "pt", "BR" */
    DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG, new Locale("pt", "BR"));
    String f3 = df3.format(d);
    System.out.println(f3);

    /* Formatando a data -> formato longo, com locale "en", "US" */
    DateFormat df4 = DateFormat.getDateInstance(DateFormat.LONG, new Locale("en", "US"));
    String f4 = df4.format(d);
    System.out.println(f4);

    /* Formatando a data -> Formato próprio */
    SimpleDateFormat df5 = new SimpleDateFormat("dd-MM-yyyy");
    String f5 = df5.format(d);
    System.out.println(f5);

    /* Gerando a partir de uma string, com definicao de padrão */
    String sd1 = "2030-07-01";
    SimpleDateFormat dt6 = new SimpleDateFormat("yyyy-MM-dd");

    try {
      Date d1 = dt6.parse(sd1);
      System.out.println(d1);
    } catch (ParseException e) {
      e.printStackTrace();
    }

  }
}
