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
public class Plastico extends Desecho {
    
    static ArrayList <String> tipo_plastico = lista();
    
    public Plastico(int id_desecho, int cantidad) {
        super(id_desecho, cantidad);
    }

    public static ArrayList<String> getTipo_plastico() {
        return tipo_plastico;
    }
    
    public static ArrayList<String> lista(){
        ArrayList <String> tipo = new ArrayList<>();
        tipo.add("Botella");
        tipo.add("Bolsas");
        tipo.add("Pitillos");
        tipo.add("Desechables");
        tipo.add("Otro");
        return tipo;
    }
}
