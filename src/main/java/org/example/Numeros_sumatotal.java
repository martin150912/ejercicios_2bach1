package org.example;

import java.util.Scanner;

public class Numeros_sumatotal {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número N: ");

        int N = teclado.nextInt();
        int suma = 0;

        for (int i = 0; i < N; i++){
            System.out.println("Introduce número " + i + ": ");
            int num = teclado.nextInt();
            suma = suma + num;
        }

        System.out.println("La suma total es: " + suma);
    }
}
