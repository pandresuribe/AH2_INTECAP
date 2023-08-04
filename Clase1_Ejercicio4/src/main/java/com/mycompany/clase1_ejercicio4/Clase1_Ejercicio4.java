
package com.mycompany.clase1_ejercicio4;

import java.util.Scanner;

public class Clase1_Ejercicio4 {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en Celsius: ");
        int C = scanner.nextInt();
            int F = 32+(9*C/5);
            
        System.out.println("La temperatura en Fahrenheit es: " +F);
    }
}
