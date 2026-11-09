package org.example;

import java.util.Scanner;

public class Subcadena {

    static void main() {

        System.out.println("Introduce una frase: ");
        Scanner RAE = new Scanner(System.in);
        String frase = RAE.nextLine();
        System.out.println("Introduce una palabra que aparezca en la frase");
        String palabra = RAE.nextLine();
        String frase2 = frase.replace(palabra,"");
        int largo1 = frase.length();
        int largo2 = frase2.length();
        int repite = (largo1 - largo2)/palabra.length();
        System.out.println("La palabra elegida aparece en el texto un total de " + repite + " veces");
    }
}
