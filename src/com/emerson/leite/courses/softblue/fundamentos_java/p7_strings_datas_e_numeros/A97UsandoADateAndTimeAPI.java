package com.emerson.leite.courses.softblue.fundamentos_java.p7_strings_datas_e_numeros;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class A97UsandoADateAndTimeAPI {

  public static void main(String[] args) {

    String dataNascimento = "05/07/1982 11:00";

    LocalDateTime d1 = LocalDateTime.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

    LocalDateTime d2 = LocalDateTime.now();

    Duration d = Duration.between(d1, d2);

    System.out.println("Horas: " + d.toHours());
    System.out.println("Dias: " + d.toDays());

    Period p = Period.between(d1.toLocalDate(), d2.toLocalDate());

    System.out.println("Meses: " + p.toTotalMonths());

    System.out.println("Semanas: " + ChronoUnit.WEEKS.between(d1, d2));

    System.out.println("Anos: " + ChronoUnit.YEARS.between(d1, d2));

    System.out.println("Meses (ChronoUnit): " + ChronoUnit.MONTHS.between(d1, d2));

  }

}
