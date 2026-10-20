package org.example;

import java.util.Scanner;

public class Positivo_Negativo_Natural {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        double x = teclado.nextDouble();
        if (x == 0) {
            System.out.println("El número es natural");
        }else if (x > 0){
            System.out.println("El número es positivo");
        }else {
            System.out.println("El número es negativo");

        }
        }
    }
