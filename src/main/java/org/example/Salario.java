package org.example;

import java.util.Scanner;

public class Salario {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántas horas trabajas al mes?");
        float horas = teclado.nextFloat();

        Scanner martin = new Scanner(System.in);
        System.out.println("¿Cuánto cobras por hora?");
        float dinero = martin.nextFloat();


        System.out.println("Salario= " + horas*dinero);


    }
}
