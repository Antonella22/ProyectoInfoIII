/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.ArrayList;

/**
 *
 * @author Antonella
 */
public class Vidrio extends Desecho{
    
    static ArrayList <String> tipo_vidrio = lista();
    
    public Vidrio(int id_desecho, int cantidad) {
        super(id_desecho, cantidad);
    }

    public static ArrayList<String> getTipo_vidrio() {
        return tipo_vidrio;
    }
    
     public static ArrayList<String> lista(){
        ArrayList <String> tipo = new ArrayList<>();
        tipo.add("Industrial");
        tipo.add("Domestico");
        return tipo;
    }
    
}
