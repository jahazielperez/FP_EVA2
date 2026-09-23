/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_4_ejerciciosif;

import java.util.Scanner;

/**
 *
 * @author jahaziel
 */
public class EVA2_4_EJERCICIOSIF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner captu = new Scanner(System.in);

        // Capturar datos del empleado
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = captu.nextLine();

        System.out.print("Ingrese el salario mensual: ");
        double salario = captu.nextDouble();

        double bono;
        double salarioFinal;

        // Evaluar el salario para asignar el bono correspondiente
        if (salario <= 12000) {
            bono = salario * 0.10;   // Bono del 10%
        } else {
            bono = salario * 0.05;   // Bono del 5%
        }
        // Calcular salario final
        salarioFinal = salario + bono;
        // Mostrar resultados
        System.out.println("--- Datos del Empleado ---");
        System.out.println("Nombre:        " + nombre);
        System.out.println("Salario:       $" + (salario));
        System.out.println("Bono:          $" + (bono));
        System.out.println("Salario final: $" + (salarioFinal));

        
}
}
