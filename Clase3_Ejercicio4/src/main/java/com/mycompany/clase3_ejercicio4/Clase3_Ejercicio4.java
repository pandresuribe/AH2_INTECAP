
package com.mycompany.clase3_ejercicio4;

public class Clase3_Ejercicio4 {

    public static void main(String[] args) {
        int tabla = 1;
        
        while (tabla <= 10) {            
            for (int i = 1; i <= 10 ; i++) {
                System.out.println( tabla + "X" + i + "=" + tabla*i );
            } tabla++;
        }
        
        
    }
}
