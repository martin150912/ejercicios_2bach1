package org.example;

import java.util.Scanner;

public class Prueba {


    static void main() {


        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Cómo te llamas?");
        String nombre = teclado.next();

        teclado.nextLine();

        System.out.println("¿A qué curso vas?");
        String curso = teclado.nextLine();


        System.out.println("Hola " + nombre + " bienvenido a " + curso);

        System.out.println("Introduce un número: ");
        int x = teclado.nextInt();
        System.out.println("Introduce otro número: ");
        int y = teclado.nextInt();
        System.out.println("El resultado es: " + (x+y));





    }

}
