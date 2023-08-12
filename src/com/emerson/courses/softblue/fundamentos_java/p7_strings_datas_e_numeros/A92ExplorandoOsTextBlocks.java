package com.emerson.courses.softblue.fundamentos_java.p7_strings_datas_e_numeros;

public class A92ExplorandoOsTextBlocks {

  /* Text blocks -> Apareceu no Java 13 */
  public static void main(String[] args) {

    String html = " <html>\n" +
        " <body>\n" +
        "   <h1>Texto qualquer</h1>\n" +
        " </body>\n" +
        " </html>\n";

    System.out.println(html);

    /* Text blocks utilizado */
    String html2 = """
          <html>
           <body>
             <h1>Texto qualquer</h1>
           </body>
         </html>
        """;

    System.out.println(html2);
  }

}
