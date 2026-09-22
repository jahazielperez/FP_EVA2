/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_if;

import java.util.Scanner;

/**
 *
 * @author jahaziel
 */
public class EVA2_2_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int calificacion;
       Scanner captu = new Scanner(System.in);
       System.out.println("tu calificacion es");
       calificacion = captu.nextInt();
       //parentesis obligatorios. dentro la expresion condicional (verdadero o falso)
       if (calificacion >=70){//que hacemos si es verdad
       System.out.println("aprobaste ");
       }else //que hacemos si es fslso (opcional)
           System.out.println("roprebaste por flojo");
       }
    
}
