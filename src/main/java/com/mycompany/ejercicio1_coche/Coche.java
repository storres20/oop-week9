/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio1_coche;

/**
 *
 * @author HP
 */
public class Coche {
    // Atributos
    String marca;
    String modelo;
    int año;

    // Constructor
    public Coche(String marca, String modelo, int año) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
    }
    
    public Coche() {
        this.marca = "Kia";
        this.modelo = "Cerato";
        this.año = 2020;
    }

    // Métodos
    public void acelerar() {
        System.out.println("El coche " + marca + " " + modelo + " está acelerando.");
    }

    public void frenar() {
        System.out.println("El coche " + marca + " " + modelo + " está frenando.");
    }

    // Método para mostrar la información del coche
    public void mostrarInfo() {
        System.out.println("Coche: " + marca + " " + modelo + " del año " + año);
    }
}

