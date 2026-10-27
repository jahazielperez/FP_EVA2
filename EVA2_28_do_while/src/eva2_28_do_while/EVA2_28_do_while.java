/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28_do_while;

import java.util.Scanner;

/**
 *
 * @author jahaziel
 */
public class EVA2_28_do_while {
static final String USUARIO = "admin";
static final String PWD = "admin";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner (System.in);
        String usu, pwd;
        
        do{
            System.out.println("Usuario");
            usu = captu.nextLine();
            System.out.println("Contra");
            pwd = captu.nextLine();
            
        }while(!(usu.equals(USUARIO)) || !(pwd.equals(PWD)));
        System.out.println("ACCCESO CONCEDIDO PE CAUSA");
    }
    
}
