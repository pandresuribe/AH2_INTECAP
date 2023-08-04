
package com.mycompany.clase1_ejercicio5;

import java.util.Scanner;

public class Clase1_Ejercicio5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el radio: ");
        
        float radio = scanner.nextInt();
        
        float longitud = (float) (2*Math.PI*radio);
        float area = (float) (Math.PI * (radio*radio));
        
        System.out.println("La longitud es: "+longitud);
        System.out.println("El area es: "+area);
        
    }
}
