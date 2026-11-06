package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Textitos {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Hola me llamo MGO");
        String texto = "Hola me llamo MGO";

        System.out.println(texto.length());
        System.out.println(texto.replace(" ",""));
        System.out.println(texto.substring(0,texto.length()/2));
        System.out.println(texto.substring(texto.length()/2));
        System.out.println(texto.toUpperCase(Locale.ROOT));
    }
}
