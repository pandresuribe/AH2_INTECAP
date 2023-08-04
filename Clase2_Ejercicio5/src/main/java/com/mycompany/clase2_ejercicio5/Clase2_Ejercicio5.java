
package com.mycompany.clase2_ejercicio5;

import java.util.Scanner;

public class Clase2_Ejercicio5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el día: ");
        int dia = sc.nextInt();

        System.out.print("Ingrese el mes: ");
        int mes = sc.nextInt();

        System.out.print("Ingrese el año: ");
        int anio = sc.nextInt();

        boolean fechaCorrecta = verificarFecha(dia, mes, anio);

        if (fechaCorrecta) {
            System.out.println("La fecha ingresada es correcta.");
        } else {
            System.out.println("La fecha ingresada es incorrecta.");
        }
    }

    public static boolean verificarFecha(int dia, int mes, int anio) {
        if (mes < 1 || mes > 12) {
            return false;
        }

        int diasEnMes;

        switch (mes) {
            case 2: // Febrero
                diasEnMes = 28;
                break;
            case 4: // Abril
            case 6: // Junio
            case 9: // Septiembre
            case 11: // Noviembre
                diasEnMes = 30;
                break;
            default: // Enero, Marzo, Mayo, Julio, Agosto, Octubre, Diciembre
                diasEnMes = 31;
                break;
        }

        return dia >= 1 && dia <= diasEnMes;
    }
}