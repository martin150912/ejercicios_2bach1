package org.example;

import java.util.Scanner;

public class Factorial_v {
    static void main() {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int N = teclado.nextInt();
        System.out.print(N + "!" + "=" );
        int contador = 1;
        for (int i = N; i >= 1; i--){

            if (i == 1){
                System.out.print(i + "=");
            }else{
                System.out.print(i + "*");
            }
            contador = contador * i;
        }
        System.out.print(contador);
    }
}
