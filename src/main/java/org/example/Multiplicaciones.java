package org.example;

public class Multiplicaciones {

    static void main() {

        int numero = 221;

        String numero_string = Integer.toString(numero);
        System.out.println(numero_string);

        String primera_cifra = numero_string.substring(2,3);
        int primera_cifra_numero = Integer.parseInt(primera_cifra);
        System.out.println(primera_cifra_numero);
    }
}
