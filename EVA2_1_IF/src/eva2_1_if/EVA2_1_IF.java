/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_1_if;

import java.util.Scanner;

/**
 *
 * @author jahaziel
 */
public class EVA2_1_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int edad;
       Scanner captu = new Scanner(System.in);
       System.out.println("cual es tu edad? ");
       edad = captu.nextInt();
       //arentesis obligatorios. dentro la expresion condicional (verdadero o falso)
       if (edad >=18){//que hacemos si es verdad
       System.out.println("bienveido, puedes entrar");
       }else {//que hacemos si es fslso (opcional)
           System.out.println("no puedes entrar");
                   
       }
    }
    
}
