/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Antonella
 */
public class Usuario {
    
    protected String nombre;
    protected String usuario;
    protected String passwd;
    protected ArrayList <String> listUsuarios = new ArrayList<>();
    
    public Usuario(String nombre,String usuario, String pass){
        this.nombre=nombre;
        this.usuario=usuario;
        this.passwd=pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public ArrayList<String> getListUsuarios() {
        return listUsuarios;
    }

    public void setListUsuarios(ArrayList<String> listUsuarios) {
        this.listUsuarios = listUsuarios;
    }
    
    public static void login(){
        
        System.out.println("Ingresar Usuario");
        Scanner sc = new Scanner(System.in);
	String user=sc.nextLine();
	
        //Lista de usuarios obtenida de base de datos y buscar us.
      
        
    }
    
}
