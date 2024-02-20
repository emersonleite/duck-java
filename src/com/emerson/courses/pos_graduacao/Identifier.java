package com.emerson.courses.pos_graduacao;

public class Identifier {
  public boolean validateIdentifier(String s) {
    char achar;
    boolean valid_id = false;

    // Evitar erro no caso de string com tamanho 0
    if (s.length() == 0) {
      return false;
    }

    achar = s.charAt(0);
    valid_id = valid_s(achar);

    if (s.length() > 1) {
      achar = s.charAt(1);
      int i = 1;
      while (i <= s.length() - 1) {
        achar = s.charAt(i);
        if (!valid_f(achar)) {
          valid_id = false;
        }
        i++;
      }
    }
    return (valid_id && (s.length() >= 1) && (s.length() <= 6));
  }

  public boolean valid_s(char ch) {
    return (((ch >= 'A') && (ch <= 'Z'))
        || ((ch >= 'a') && (ch <= 'z')));
  }

  public boolean valid_f(char ch) {
    return (((ch >= 'A') && (ch <= 'Z'))
        || ((ch >= 'a') && (ch <= 'z'))
        || ((ch >= '0') && (ch <= '9')));
  }
}