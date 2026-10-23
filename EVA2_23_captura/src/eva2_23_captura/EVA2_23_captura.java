/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_23_captura;

import java.util.Scanner;

/**
 *
 * @author jahaziel
 */
public class EVA2_23_captura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here\
        //solicita las califas de un grupo y pomedios 
        int cant, califa = 0;
        double promedio;
        Scanner captu = new Scanner(System.in);
        System.out.println("cuantas calificaciones vas a capturar");
        cant = captu.nextInt();
        captu.nextLine();
        for(int i = 0; i < cant; i++){
            System.out.println("captura las caalifas: ");
            califa = califa + captu.nextInt();
            
            captu.nextLine();
        }
        System.out.println("acumulado" + califa);
        promedio = califa / (cant * 1.0);
        System.out.println("promedio" + promedio);
    }
    
    
}
