/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_.pkg20_ejercicio_switch;

import java.util.Scanner;

/**
 *
 * @author jahaziel
 */
public class EVA2_20_ejercicio_switch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        System.out.println("ingresar valor de 1: ");
        int v1 = captu.nextInt();
        System.out.println("ingresar valor de 2: ");
        int v2 = captu.nextInt();
        System.out.println("operacion a realizar ; 1 suma ; 2 resta : 3 multiplicacion ; 4 division ");
        int operacion = captu.nextInt();
        
        switch(operacion){
            case 1 : 
                 System.out.println("resultado : " + (v1 + v2));
                 
               break;
               
           case 2 ://resta
               System.out.println("resultado : " + (v1 - v2));
               
               break ;
              
           case 3://multiplicacion
               System.out.println("resultado : " + (v1 * v2));
              
               break;
               
           case 4://division
               System.out.println("resultado: " + ((double)v1 / v2));
               
               break;
               
           default: //cualquier otro valor --> operacion invalida
               System.out.println("operacion invalida ");
               break;
        
        }
        
        
        
    }
    
}
