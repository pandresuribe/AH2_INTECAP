
package com.mycompany.clase2_ejercicio1;

import java.util.Scanner;

public class Clase2_Ejercicio1 {

     public static void main(String[] 
    args) {
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Ingrese el primer numero: ");
            int num1 = scanner.nextInt();
            
            System.out.println("Ingrese el segundo numero: ");
            int num2 = scanner.nextInt();
            
            if (num1 == num2) {
                System.out.println("Son numeros iguales");
            
        }else {
                System.out.println("No son numeros iguales");
        
        }
}
}
