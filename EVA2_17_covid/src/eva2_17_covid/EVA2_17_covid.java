/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_17_covid;

import java.util.Scanner;

/**
 *
 * @author jahaziel
 */
public class EVA2_17_covid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner captu = new Scanner(System.in);

        System.out.print("Ingrese la edad: ");
        int edad = captu.nextInt();

        System.out.print("¿Tiene alguna enfermedad crónica? (s/n): ");
        String cronica = captu.next();

        System.out.print("Ingrese el peso en kg: ");
        double peso = captu.nextDouble();

        System.out.print("Ingrese la estatura en metros: ");
        double estatura = captu.nextDouble();

        double imc = peso / (estatura * estatura);

        boolean riesgo = false;

        if (edad > 65) {
            riesgo = true;
        } else if (cronica.equalsIgnoreCase("s")) {
            riesgo = true;
        } else if (imc >= 25) {
            riesgo = true;
        }

        System.out.println("IMC: " + imc);

        if (riesgo) {
            System.out.println("La persona SÍ presenta riesgo ante el COVID.");
        } else {
            System.out.println("La persona NO presenta riesgo ante el COVID.");
        }

    }
    
}
