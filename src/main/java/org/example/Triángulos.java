package org.example;

import java.util.Scanner;

public class Triángulos {

    static void main() {

        Scanner teclado = new Scanner(System.in);

        System.out.println("Introduce la medida del primer lado: ");
        double x = teclado.nextDouble();
        System.out.println("Introduce la medida del segundo lado: ");
        double y = teclado.nextDouble();
        System.out.println("Introduce la medida del tercer lado:");
        double z = teclado.nextDouble();
        if ((x == y) && (x == z)){
            System.out.println("Es equilátero");
        } else if ((x != z) && (x == y)){
            System.out.println("Es isósceles");
        } else{
            System.out.println("Es escaleno");
        }
    }
}
