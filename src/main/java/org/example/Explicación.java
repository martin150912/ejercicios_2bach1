package org.example;

public class Explicación {

    static void main() {

        int numero = 123;

        int derecha = numero % 10;
        int medio = (numero / 100) % 10;
        int izquierda = (numero / 100);

        System.out.println(derecha + " " + medio + " " + izquierda);
    }
}
