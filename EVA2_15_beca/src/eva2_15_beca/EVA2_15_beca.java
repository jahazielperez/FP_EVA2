/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_beca;

import java.util.Scanner;

/**
 *
 * @author jahaziel
 */
public class EVA2_15_beca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner entradaCalificacion = new Scanner(System.in);
        System.out.print("Ingrese el promedio: ");
        double promedio = entradaCalificacion.nextDouble();

        if (promedio > 80) {
            System.out.println("Calificacion: Si cumple (mayor a 80).");
        } else {
            System.out.println("Calificacion: No cumple (debe ser mayor a 80).");
        }

      
        Scanner entradaIngresos = new Scanner(System.in);
        System.out.print("Ingrese los ingresos mensuales: ");
        double ingresos = entradaIngresos.nextDouble();

        if (ingresos < 10000) {
            System.out.println("Ingresos: Si cumple (menor a 10000).");
        } else {
            System.out.println("Ingresos: No cumple (debe ser menor a 10000).");
        }

        
        if (promedio > 80 && ingresos < 10000) {
            System.out.println("Resultado: La persona Si obtiene la beca.");
        } else {
            System.out.println("Resultado: La persona No obtiene la beca.");
        }
    }
    
}
