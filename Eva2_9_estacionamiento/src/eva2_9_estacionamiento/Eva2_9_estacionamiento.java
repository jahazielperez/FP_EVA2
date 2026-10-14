/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_estacionamiento;

import java.util.Scanner;

/**
 *
 * @author jahaziel
 */
public class Eva2_9_estacionamiento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int horas ,Costo;
        Scanner captu = new Scanner(System.in);
        System.out.println("Cantidad de horas:");
        horas = captu.nextInt();
         if (horas > 10) {

            Costo = 150;
            System.out.println("Total a pagar = " + Costo);

        } else if (horas > 5 ) {

           Costo = horas * 20;
            System.out.println("Total a pagar = " + Costo );
            
        } else if (horas > 2) {
             Costo = horas * 25;
            System.out.println("Total a pagar = " + Costo );
        }else if (horas > 0) {
            Costo = horas * 25;
            System.out.println("Total a pagar = " + Costo );
            
        }

       
    }

}

