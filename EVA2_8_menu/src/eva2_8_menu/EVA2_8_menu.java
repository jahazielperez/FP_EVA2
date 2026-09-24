/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_8_menu;

import java.util.Scanner;

/**
 *
 * @author jahaziel
 */
public class EVA2_8_menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion;
        Scanner captu = new Scanner(System.in);
        System.out.println(">>>>>>>>>>>>>>>>>>>MENU RESTAURANTE LA CUCARACHA CROCANTE <<<<<<<<<<<<<<<");
        System.out.println("1. VENTAS");
        System.out.println("2. proveedores");        
        System.out.println("3. empleados");
        System.out.println("4. inventario");
        System.out.println("5. salir");
        System.out.println("seleccionar una opcion");
        opcion = captu.nextInt();
        if(opcion == 1){
            System.out.println("pantalla de ventas");
        }else if(opcion == 2){
            System.out.println("pantalla de proveedores");
        }else if(opcion == 3){
            System.out.println("pantalla de empleados");
        }else if(opcion == 4){
            System.out.println("pantalla de inventario");
        }else if(opcion == 5){
            System.out.println("chao bro");
        }else{
            System.out.println("opcion incorrecta");
        }
    }
    
}
