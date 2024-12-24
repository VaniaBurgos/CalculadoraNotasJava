/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.notas;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Notas {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useLocale(Locale.US)){
            
            System.out.println("Buen dia! Por favor, ingresa tus datos.");
            
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            
            System.out.println("Ingresa tu asistencia (%): ");
            double asistencia= scanner.nextDouble();
            
            System.out.print("Cuantas notas tienes?");
            int cantidadNotas = scanner.nextInt();
            
            double nota;
            double suma = 0;

        for (int i = 0; i < cantidadNotas; i++) {
            System.out.print("Ingrese nota: ");
            nota = scanner.nextDouble();
            suma += nota; 
        }

        double promedioNotas = suma / cantidadNotas; 
        System.out.println("Su promedio de notas es de: " + promedioNotas);

        if (asistencia >= 60) {
            if (promedioNotas <= 2.0) {
                System.out.println("Reprobado por calificación.");
            } else {
                if (promedioNotas >= 5.5) {
                    System.out.println("Aprobado.");
                } else {
                    System.out.println("Debe rendir examen.");

                    double examen = (4.0 - (promedioNotas * 0.7)) / 0.3; 

                    if (examen < 0) {
                        System.out.println("No es necesario rendir examen.");
                    } else {
                        if (examen <= 7.0) {
                            System.out.println("Para aprobar, la calificación mínima de tu examen debe ser " + examen);
                        } else {
                            System.out.println("Reprobado por calificación.");
                        }
                    }
                }
            }
        } else {
            System.out.println("Reprobado por asistencia.");
        }

        scanner.close();
    }
    }
}
