
package com.mycompany.clase2_ejercicio3;

import java.util.Scanner;

public class Clase2_Ejercicio3 {

   public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el primer numero: ");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int numero2 =scanner.nextInt();
        
        if (numero1 == numero2) {
            System.out.println("Son iguales");
        }else if (numero1 > numero2) {
            System.out.println( numero1 + " " + numero2 );
        }else { 
            System.out.println( numero2 + " " + numero1 );
        }
    }
}
