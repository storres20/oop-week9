/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio1_coche;

/**
 *
 * @author HP
 */
public class Ejercicio1_Coche {

    public static void main(String[] args) {
        // Crear un objeto de la clase Coche
        Coche miCoche = new Coche("Toyota", "Corolla", 2020);

        // Llamar a los métodos del objeto
        miCoche.mostrarInfo();
        miCoche.acelerar();
        miCoche.frenar();
    }
}
