/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_29_do.pkgwhile;

import java.util.Scanner;

/**
 *
 * @author jahaziel
 */
public class EVA2_29_doWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int monto,cuenta = 5000;
        
        do {
            System.out.println("cuanto quieres retirar?");
            monto = captu.nextInt();
            cuenta = cuenta - monto;
            System.out.println("tu saldo es de =" + cuenta);
        }while(cuenta > 0);
        System.out.println("se te acabo el ninero perro");
        
    }
        }

