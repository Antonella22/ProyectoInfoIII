/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Control.Usuario;
import java.util.Scanner;

/**
 *
 * @author Antonella
 */
public class ProyectoInfoIII {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
           //showMenuConsole();
           //Iniciar Jframe pppal
           new Auth().setVisible(true);
    }
    
    
    
    public static void showMenuConsole() {
       
        int exit = 0;
        
        do {
			
            System.out.println("IGarbage");
            System.out.println("");
            System.out.println("Seleccionar opción");
            System.out.println("1. Ingresar");
            System.out.println("2. Registrar");
            System.out.println("0. Exit");

            //Leer la respuesta del usuario			
            Scanner sc = new Scanner(System.in);
            int response=sc.nextInt();

            switch (response) {
                    case 0:
                            //salir
                            exit = 0;
                            break;
                    case 1:
                            Usuario.login();
                            break;

                    case 2:
                            Usuario.registrar();
                            break;
                            
                    default:
                            System.out.println();
                            System.out.println("....¡¡Seleccionar una opción!!....");
                            System.out.println();
                            break;
            }

        }while(exit != 0);
			
    }
}