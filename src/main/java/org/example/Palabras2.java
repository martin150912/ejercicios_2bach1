package org.example;

import java.util.Scanner;

public class Palabras2 {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una palabra: ");
        String palabra1 = teclado.nextLine();
        System.out.println("Introduce otra palabra: ");
        String palabra2 = teclado.nextLine();

        if (palabra1.length() > palabra2.length()){
            System.out.println("La palabra " + palabra1 + " es más larga");
        }else if (palabra2.length() > palabra1.length()){
            System.out.println("La palabra " + palabra2 + " es más larga");
        }else{
            System.out.println("Las palabras son iguales");
        }
    }
}
