

package com.mycompany.clase1_ejercicio1;

import java.util.Scanner;

public class Clase1_Ejercicio1 {

     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número entero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Ingresa el segundo número entero: ");
        int numero2 = scanner.nextInt();

        System.out.println("Los números ingresados son: " + numero1 + " y " + numero2);

        scanner.close();
    }
}