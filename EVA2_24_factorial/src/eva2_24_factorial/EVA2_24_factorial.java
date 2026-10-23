/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_factorial;

import java.util.Scanner;

/**
 *
 * @author jahaziel
 */
public class EVA2_24_factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nume , facto = 1;
        Scanner captu = new Scanner(System.in);
        System.out.println("valor a calcular ");
        nume = captu.nextInt();
        for(int i = nume; i >=1; i--){
       facto = facto  * i;
               }
        System.out.println("factorial de: " + nume + " = " + facto);
        
        for( int i = nume; i <= 1; i++){
       facto = facto  * i;
        }
    System.out.println("factorial de: " + nume + " = " + facto);
    }
    
}

