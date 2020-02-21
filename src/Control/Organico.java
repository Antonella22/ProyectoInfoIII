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
public class Organico extends Desecho {
    
    static ArrayList <String> tipo_organico = lista();


    public Organico(int id_desecho, int cantidad) {
        super(id_desecho, cantidad);
    }

    public static ArrayList<String> getTipo_organico() {
        return tipo_organico;
    }

    public static ArrayList<String> lista(){
        ArrayList <String> tipo = new ArrayList<>();
        tipo.add("Cascaras de fruta");
        tipo.add("Pan");
        tipo.add("Restos de comida");
        tipo.add("Servilletas");
        tipo.add("Cascaron de huevo");
        tipo.add("Verduras y hortalizas");
        tipo.add("Otro");
        return tipo;
    }
    
}
