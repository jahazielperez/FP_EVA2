/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_33_break;

import java.util.Scanner;

/**
 *
 * @author jahaziel
 */
public class Eva2_33_break {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nume;
        int valor = 10;
        Scanner captu = new Scanner(System.in);
        while(true){
            System.out.println("introduce el valor:");
            nume = captu.nextInt();
            captu.nextLine();
            
            if(nume == valor){
                System.out.println("LE ATINASTE PAAA!!!!");
                break;
            }
        }
    }
    
}
