package org.example;

import java.util.Scanner;

public class Bocadillo {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Tengo tomate?");
        char x = teclado.next().charAt(0);

        if (x == 'N'){
            System.out.println("Tengo que ir a comprar");

        }else {
            System.out.println("¿Tengo aceite?");
            char y = teclado.next().charAt(0);
            if (y == 'N') {
                System.out.println("Tengo que ir a comprar");

            }else {
                System.out.println("¿Tengo jamón?");
                char z = teclado.next().charAt(0);
                if (z == 'N'){
                    System.out.println("Tengo que ir a comprar");
                }else {
                    System.out.println("Voy a hacer el bocadillo");
                }
                }
            }
        }
    }
