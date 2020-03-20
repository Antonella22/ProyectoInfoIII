/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import DAO.EstadisticasDAO;
import DAO.UsuarioDAO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Antonella
 */
public class Usuario implements UsuarioDAO {
    
    private String correo;
    private String nombre;
    private String passwd;
    private String tipo;
    static ArrayList <Usuario> listUs ;//= listaUsuarios();
    
    public Usuario() {
    }
    
    public Usuario(String correo,String nombre, String pass){
        this.correo=correo;
        this.nombre=nombre;
        this.passwd=pass;
    }
    
    public Usuario(String correo, String pass){
        this.correo=correo;
        this.passwd=pass;
    }  

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public static ArrayList<Usuario> getListUs() {
        return listUs;
    }

    public static void setListUs(ArrayList<Usuario> listUs) {
        Usuario.listUs = listUs;
    }

    public static ArrayList<Usuario> listaUsuarios(){
        Usuario usuario = new Usuario();
	return usuario.readDates();
    }
              
}
