/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_switch2;

import java.util.Scanner;

/**
 *
 * @author jahaziel
 */
public class EVA2_19_switch2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        String carrera;
        System.out.println("introducir la carrera (ISC, informatica, administracion");
        carrera = captu.nextLine();
        
        switch(carrera) { //if(carrera.equals("ISC"))
            case "ISC": 
                System.out.println("ISC");
                break;
            case "informatica": 
                System.out.println("informatica");
                break;
                 case "administracion": 
                System.out.println("administracion");
                break;
        }
    }
    
}
