package org.example;

import java.util.Scanner;

public class Suma_vocales {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase: ");

        String frase = teclado.nextLine();
        int longitud = frase.length();
        System.out.println("a: ");
        System.out.println("e: ");
        System.out.println("i: ");
        System.out.println("o: ");
        System.out.println("u: ");
        System.out.println("VOCALES: ");


        for (int i = 0 ; i < frase.length() ; i++){

            switch (frase.charAt(i)){
                case 'a':
                    break;
                case 'e':
                    break;
                case 'i':
                    break;
                case 'o':
                    break;
                case 'u':
                    break;

            }

        }

    }
}
