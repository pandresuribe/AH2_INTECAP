
package com.mycompany.ejercicio_4;

import java.util.Scanner;

public class Ejercicio_4 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su primer numero");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese su segundo numero");
        int numero2 = scanner.nextInt();
        System.out.println("Ingrese su tercer numero");
        int numero3 = scanner.nextInt();

 
        if (numero1 > numero2) {
            if (numero1 > numero3) {
                if (numero2 > numero3) {
                    System.out.println(numero1 + " " + numero2 + " " + numero3);
                } else {
                    System.out.println(numero1 + " " + numero3 + " " + numero2);
                }
            } else {
                System.out.println(numero3 + " " + numero1 + " " + numero2);

 

            }
        } else {
            if (numero2 > numero3) {
                if (numero1 > numero3) {
                    System.out.println(numero2 + " " + numero1 + " " + numero3);
                } else {
                    System.out.println(numero2 + " " + numero3 + " " + numero1);
                }
            } else {
                System.out.println(numero3 + " " + numero2 + " " + numero1);

 

            }
        }

 

    }
}