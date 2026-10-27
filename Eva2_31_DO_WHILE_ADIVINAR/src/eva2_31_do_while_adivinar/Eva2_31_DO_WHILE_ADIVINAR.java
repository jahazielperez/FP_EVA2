/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_31_do_while_adivinar;

import java.util.Scanner;

/**
 *
 * @author jahaziel
 */
public class Eva2_31_DO_WHILE_ADIVINAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner captu = new Scanner(System.in);
        int numeroSecreto = 90;
        int intento;

        do {
            System.out.print("Adivina el numero: ");
            intento = captu.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("Muy bajo mijo ");
            } else if (intento > numeroSecreto) {
                System.out.println("Muy alto pe");
            } else {
                System.out.println("tas perro");
            }

        } while (intento != numeroSecreto);

    }
    
}
