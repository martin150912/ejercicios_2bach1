package org.example;

import java.util.Scanner;

public class ELECCIONES29N {

    static void main() {


        Scanner ayuso = new Scanner(System.in);
        System.out.println("¿Qué edad tienes?");
        int edad = ayuso.nextInt();

        if (edad <= 0){
            System.out.println("No me vaciles");
        }else{
            if (edad >= 18){
            System.out.println("¿A quién quieres votar?");
            }else{
                System.out.println("Tira pa casa a jugar a la play");
            }
        }
    }
}
