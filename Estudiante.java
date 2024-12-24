/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.notas;

/**
 *
 * @author ASUS
 */
public class Estudiante {
    
    // Atributos:
    private String nombre;
    private int cantidadNotas;
    private double[] notas;
    private double asistencia;

    // Constructor:
    public Estudiante(String nombre, int cantidadNotas, double asistencia) {
        this.nombre = nombre;
        this.cantidadNotas = cantidadNotas;
        this.notas = new double[cantidadNotas];
        this.asistencia = asistencia;
    }

    // Métodos:

    // Setters:
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidadNotas(int cantidadNotas) {
        this.cantidadNotas = cantidadNotas;
        this.notas = new double[cantidadNotas]; 
    }

    public void setAsistencia(double asistencia) {
        this.asistencia = asistencia;
    }

    // Método con arreglo para el ingreso de notas:
    public void agregarNotas(int index, double nota) {
        if (index >= 0 && index < cantidadNotas) {
            notas[index] = nota;
        } else {
            System.out.println("Índice fuera de rango. Intente nuevamente.");
        }
    }

    // Método para el cálculo del promedio de notas
    public double calcularPromedio() {
        double suma = 0.0;
        for (double nota : notas) {
            suma += nota;
        }
        return cantidadNotas > 0 ? suma / cantidadNotas : 0.0;//?: Condición. Si hay notas, se calcula el promedio. Si no, se evita la división por cero.
    }
    public double obtenerNotaMasAlta() {
        double notaMasAlta = notas[0];
        for (double nota : notas) {
            if (nota > notaMasAlta) {
                notaMasAlta = nota;
            }
        }
        return notaMasAlta;
    }

    // Método para obtener la nota más baja
    public double obtenerNotaMasBaja() {
        double notaMasBaja = notas[0];
        for (double nota : notas) {
            if (nota < notaMasBaja) {
                notaMasBaja = nota;
            }
        }
        return notaMasBaja;
    }

    // Getters:
    public String getNombre() {
        return nombre;
    }

    public int getCantidadNotas() {
        return cantidadNotas;
    }

    public double[] getNotas() {
        return notas;
    }

    public double getAsistencia() {
        return asistencia;
    }
}
