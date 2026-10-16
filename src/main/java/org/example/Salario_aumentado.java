package org.example;

import java.util.Scanner;

public class Salario_aumentado {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántas horas trabajas al mes?");
        float horas = teclado.nextFloat();

        Scanner martin = new Scanner(System.in);
        System.out.println("¿Cuánto cobras por hora?");
        float dinero = martin.nextFloat();

        if (horas <= 40){
            System.out.println("Salario= " + horas*dinero);
        }else{
            float horasextra = horas-40;
            System.out.println("Salario= " + horas*dinero + );
        }
    }
}
