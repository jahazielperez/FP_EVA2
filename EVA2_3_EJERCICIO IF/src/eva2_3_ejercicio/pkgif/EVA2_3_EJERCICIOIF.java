/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_ejercicio.pkgif;

import java.util.Scanner;

/**
 *
 * @author jahaziel
 */
public class EVA2_3_EJERCICIOIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   Scanner captu = new Scanner(System.in);

        // Capturar el precio del producto
        System.out.print("Ingrese el precio del producto: ");
        double precio = captu.nextDouble();

        // Capturar la cantidad
        System.out.print("Ingrese la cantidad: ");
        int cantidad = captu.nextInt();

        // Calcular el subtotal
        double subtotal = precio * cantidad;
        double descuento = 0.1;
        double total;

        // Aplicar descuento si el subtotal es mayor a 1000
        if (subtotal > 1000) {
            descuento = subtotal * 0.1;
            total = subtotal - descuento;
            System.out.println("--- Se aplicó un descuento del 10% ---");
        } else {
            total = subtotal;
            System.out.println("--- No aplica descuento (subtotal <= 1000) ---");
        }

        // Mostrar resultados
        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Descuento:$" + descuento);
        System.out.println("Total:$" + total);

    }
    }