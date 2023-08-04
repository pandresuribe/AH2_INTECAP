
package com.mycompany.ejercicio_2;

import java.util.Scanner;

public class Ejercicio_2 {

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
