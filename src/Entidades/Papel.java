/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author Antonella
 */
public class Papel extends Reciclar {
    
    static ArrayList <String> tipo_papel = lista();

    public Papel(int id_desecho, int cantidad) {
        super(id_desecho, cantidad);
    }

    public static ArrayList<String> getTipo_papel() {
        return tipo_papel;
    }
    
    public static ArrayList<String> lista(){
        ArrayList <String> tipo = new ArrayList<>();
        tipo.add("Periodico");
        tipo.add("Carton");
        tipo.add("Cartulina");
        tipo.add("Revista");
        tipo.add("Otro");
        return tipo;
    }
    
}
