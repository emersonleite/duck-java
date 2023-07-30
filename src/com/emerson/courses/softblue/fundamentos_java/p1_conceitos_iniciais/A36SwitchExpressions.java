package com.emerson.courses.softblue.fundamentos_java.p1_conceitos_iniciais;

public class A36SwitchExpressions {
  /* Outra forma de trabalhar com SWITCH */

  public enum DiaDaSemana {
    SEGUNDA,
    TERCA,
    QUARTA,
    QUINTA,
    SEXTA,
    SABADO,
    DOMINGO
  }

  public static void main(String[] args) {

    DiaDaSemana d = DiaDaSemana.SEGUNDA;

    switch (d) {
      case SEGUNDA:
        System.out.println(1);
        /* break; */
      case TERCA:
        System.out.println(2);
        break;
      default:
        break;
    }

    /* SWITCH EXPRESSIONS utiliza o operador '->' , sem 'break' */

    /* Não necessidade de break */
    DiaDaSemana d2 = DiaDaSemana.QUARTA;
    switch (d2) {
      case SEGUNDA -> System.out.println(1);
      case TERCA -> System.out.println(2);
      default -> System.out.println("Outro");
    }

    /* Possibilidade de associar a uma variável */
    int i = switch (d2) {
      case SEGUNDA -> 1;
      case TERCA -> 2;
      default -> 0;
    };

    System.out.println(i);

  }

}
