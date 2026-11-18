package org.example;

import java.util.Scanner;

public class Tablitas_de_multipliqueision {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int N = teclado.nextInt();
        for ( int i = 0; i <= 10; i++){
            System.out.println(N+ " * " + i + "=" + (N*i));
        }

    }
}
