package org.example;

import java.util.Scanner;

public class Salario_aumentado {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        final double JORNADALABORAL = 40;

        System.out.println("¿Cuántas horas trabajas al mes?");
        double horas = teclado.nextDouble();

        Scanner martin = new Scanner(System.in);
        System.out.println("¿Cuánto cobras por hora?");
        double dinero = martin.nextDouble();

        if (horas <= JORNADALABORAL){
            double salario = horas*dinero;
            System.out.println("Salario= " + salario);
        }else{
            double horasextra = horas - JORNADALABORAL;
            double sueldo_extra = horasextra*dinero*1.5;
            double salario = dinero*JORNADALABORAL + sueldo_extra;
            System.out.println("Salario con horas extra= " + salario);
        }
    }
}
