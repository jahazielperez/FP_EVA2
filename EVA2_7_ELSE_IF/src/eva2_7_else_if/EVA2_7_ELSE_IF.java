/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_7_else_if;

import java.util.Scanner;

/**
 *
 * @author jahaziel
 */
public class EVA2_7_ELSE_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TEMPERATURA
        //35 MUY CALIDO
        //20 AGRADABLE
        //10 FRESCO
        //MUY FRIO
        int temp;
        Scanner captu = new Scanner(System.in);
        System.out.println("cual es la temperatura?:");
        temp = captu.nextInt();
        if(temp >= 35)
            System.out.println("muy calido");
        else if(temp >= 20) 
           System.out.println("agradable");
        else if(temp >= 10)
            System.out.println("fresco");
        else
            System.out.println("te frizeas las bolas");
    }
    
}
