package org.example;

import java.util.Scanner;

public class VariableN {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Inserta un número...");
        String numero = teclado.next();
        //123123124

        int borrar = teclado.nextInt();
        //3

        int pos_final = numero.length() - borrar;
        System.out.println(numero.substring(0,pos_final));
    }
}
