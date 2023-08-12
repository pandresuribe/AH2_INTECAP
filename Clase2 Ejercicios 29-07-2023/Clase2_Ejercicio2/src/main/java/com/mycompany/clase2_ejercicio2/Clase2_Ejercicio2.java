
package com.mycompany.clase2_ejercicio2;

import java.util.Scanner;

public class Clase2_Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        int num = scanner.nextInt();
        
        if (num >= 0) {
                System.out.println("El numero es positivo.");
        }else {
                System.out.println("El numero es negativo.");
        
        }
}
}
