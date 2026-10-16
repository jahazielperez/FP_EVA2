/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_16_descuento;

import java.util.Scanner;

/**
 *
 * @author jahaziel
 */
public class EVA2_16_descuento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner Captu = new Scanner(System.in);
        System.out.print("Ingrese la edad: ");
        int edad = Captu.nextInt();
        Captu.nextLine();

        boolean tieneDescuento = false;

        if (edad < 18) {
            tieneDescuento = true;
        } else {
            System.out.print("¿Tiene credencial de estudiante vigente? (s/n): ");
            String estudiante = Captu.nextLine();

            System.out.print("¿Tiene credencial del INSEN? (s/n): ");
            String insen = Captu.nextLine();

            if (estudiante.equalsIgnoreCase("s")) {
                tieneDescuento = true;
            } else if (edad > 60) {
                tieneDescuento = true;
            }
        }

        if (tieneDescuento) {
            System.out.println("La persona si tiene descuento en el bus.");
        } else {
            System.out.println("La persona no tiene descuento en el bús.");
        }
    }
    
}
    