
package com.mycompany.clase1_ejercicio2;

import java.util.Scanner;

public class Clase1_Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Buenos días, " + nombre + ".");

        scanner.close();
    }
}