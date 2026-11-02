package org.example;

import java.util.Scanner;

public class Multiplicaciones_3cifras {

    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número de 3 cifras: ");
        Integer numero = teclado.nextInt();
        System.out.println("Introduce otro número de 3 cifras: ");
        Integer numero2 = teclado.nextInt();

        if (numero < 1000 && numero >= 100 && numero2 < 1000 && numero2 >= 100) {

            int multiplicacion = numero * numero2;
            System.out.println("El resultado del producto es: " + multiplicacion);

            String multiplicador = numero2.toString();
            String primera_cifra = multiplicador.substring(2, 3);
            String segunda_cifra = multiplicador.substring(1, 2);
            String tercera_cifra = multiplicador.substring(0, 1);
            int primera_cifra_numero = Integer.parseInt(primera_cifra);
            int segunda_cifra_numero = Integer.parseInt(segunda_cifra);
            int tercera_cifra_numero = Integer.parseInt(tercera_cifra);

            System.out.println("  " + numero);
            System.out.println("x " + numero2);
            System.out.println("--------");
            System.out.println("  " + (primera_cifra_numero * numero));
            System.out.println((segunda_cifra_numero * numero) + "x");
            System.out.println((tercera_cifra_numero * numero) + "xx");
            System.out.println("--------");
            System.out.println(multiplicacion);
        }else {
            System.out.println("ERROR, el número no tiene tres cifras");
        }
    }
}
