package org.example;

import java.util.Scanner;

public class Ferianteratavacilona {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("BIENVENIDOS AL RATÓN JUGUETÓN");
        System.out.println("Indica tu altura (cm): ");
        float altura = teclado.nextFloat();

        if (altura < 0 || altura > 230){
            System.out.println("ERROR DE LECTURA, BAJA DE LA BÁSCULA Y VUELVE A SUBIR");
        }else if (altura < 140){
                System.out.println("Lo siento, no puedes montar en esta atracción, te faltan: " + (140 - altura) + "cm");
        }

        double pesomínimo = altura*2/8;
        System.out.println("Indica tu peso (kg), es necesario para la atracción");
        float peso = teclado.nextFloat();

        if (peso < pesomínimo || peso > 120){
            System.out.println("Lo siento, no puedes subir, te faltan: " + (140 - pesomínimo));
        }else{
            System.out.println("SUBE A LA ATRACCIÓN");
        }




    }
}

