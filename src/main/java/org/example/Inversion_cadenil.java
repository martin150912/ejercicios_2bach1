package org.example;

import java.util.Scanner;

public class Inversion_cadenil {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        String frase = "hola soy martin garcia oliva";

        int mgo = frase.length()-1;

        for (int i = mgo ; i >= 0 ; i--){
            System.out.print(frase.charAt(i));
        }
    }
}
