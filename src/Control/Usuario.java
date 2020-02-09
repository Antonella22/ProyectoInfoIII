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
public class Usuario {
    
    public String nombre;
    public String usuario;
    public String passwd;
    public ArrayList <String> listUsuarios = new ArrayList<>();
    
    public Usuario(String nombre,String usuario, String pass){
        this.nombre=nombre;
        this.usuario=usuario;
        this.passwd=pass;
    }
    
}
