/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_califa;

import java.util.Scanner;

/**
 *
 * @author jahaziel
 */
public class EVA2_10_CALIFA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double promedio;
        Scanner captu = new Scanner(System.in);

        System.out.println("Ingrese el promedio del estudiambre:");
        promedio = captu.nextDouble();

        if (promedio < 0 || promedio > 100) {
            System.out.println("Dato inválido");

        } else if (promedio < 70) {
            System.out.println("Desempeño: Insuficiente");

        } else if (promedio < 80) {
            System.out.println("Desempeño: Aceptable");

        } else if (promedio < 90) {
            System.out.println("Desempeño: Bueno");

        } else {
            System.out.println("Desempeño: Sobresaliente");
        }

    }
    
}
