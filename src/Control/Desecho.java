/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Vista.ProyectoInfoIII;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Antonella
 */
public class Desecho {

    public int vidrio=0;
    public int papel=0;
    public int organico=0;
    public int plastico=0;
    protected static ArrayList <Desecho> listDesechos = new ArrayList<>();

    public int getVidrio() {
        return vidrio;
    }

    public void setVidrio(int vidrio) {
        this.vidrio = vidrio;
    }

    public int getPapel() {
        return papel;
    }

    public void setPapel(int papel) {
        this.papel = papel;
    }

    public int getOrganico() {
        return organico;
    }

    public void setOrganico(int organico) {
        this.organico = organico;
    }

    public int getPlastico() {
        return plastico;
    }

    public void setPlastico(int plastico) {
        this.plastico = plastico;
    }
    
    static void showOptions(String User){
        
        int exit = 0;
        
        do {
        System.out.println("");
        System.out.println("1. Seleccionar Desecho");
        System.out.println("2. Ver estadisticas");
        System.out.println("3. Logout");
        System.out.println("0. Exit");
        
        Scanner sc = new Scanner(System.in);
        int response=sc.nextInt();

            switch (response) {
                    case 0:
                            //salir
                            exit = 0;
                            break;
                    case 1:
                            Desecho.seleccion();
                            break;

                    case 2:
                            //if(user==admin){
                            //Desecho.estadisticas();
                            //}else{
                            ////Desecho.estadisticasTotal();
                            //}
                            break;
                    case 3:
                            ProyectoInfoIII.showMenuConsole();
                            break;
                    default:
                            System.out.println();
                            System.out.println("....¡¡Seleccionar una opción!!....");
                            System.out.println();
                            break;
            }

        
        }while(exit != 0);
       
    }
    
    static void seleccion() {
        
        int exit = 0;     

        do {
             System.out.println(":::");
             System.out.println("1. Vidrio");
             System.out.println("2. Papel");
             System.out.println("3. Organico");
             System.out.println("4. Ordinario");
             System.out.println("0. exit");

            Scanner sc = new Scanner(System.in);
            int response=sc.nextInt();

                 switch (response) {
                    case 0:
                            //salir
                            exit = 0;
                            break;
                    case 1:
                            //vidrio++;                 //Incrementar cantidad de vidrio
                            break;

                    case 2:
                          
                            break;
                     case 3:
                          
                            break;
                     case 4:
                          
                            break;
                    default:
                            System.out.println();
                            System.out.println("....¡¡Seleccionar una opción!!....");
                            System.out.println();
                            break;
                  }
        }while(exit!=0);
      
         
    }
    
}
