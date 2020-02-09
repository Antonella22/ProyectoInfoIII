/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Vista.ProyectoInfoIII;
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
    protected ArrayList <Usuario> listUsuarios = new ArrayList<>();

    public Usuario() {
    }
    
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

    public ArrayList<Usuario> getListUsuarios() {
        return listUsuarios;
    }

    public void setListUsuarios(ArrayList<Usuario> listUsuarios) {
        this.listUsuarios = listUsuarios;
    }
    
    public static void login(){
        
        System.out.println("Ingresar Usuario");
        Scanner sc = new Scanner(System.in);
	String user=sc.nextLine();
	
        //Lista de usuarios obtenida de base de datos y buscar us.
      
        
    }
    
    public static void registrar(){
        
        Scanner sc = new Scanner(System.in);
        Usuario us = new Usuario();
        System.out.println("Registro de usuarios");
        System.out.println("Ingrese el nombre del usuario");
	String nombre =sc.nextLine();
        System.out.println("Ingrese el usuario");
	String user =sc.nextLine();
        System.out.println("Ingrese contraseña");
	String pass =sc.nextLine();
        us = new Usuario(nombre, user, pass);
        us.listUsuarios.add(us);
        ProyectoInfoIII.showMenu();
    }
    
}
