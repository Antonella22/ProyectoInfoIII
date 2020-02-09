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
    //public ArrayList <Usuario> listUsuarios = new ArrayList<>();   
    public static ArrayList <Usuario> listUsuarios;
    
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
        
        //Recorrer y buscar usuario en lista para verificar existencia.
        for(Iterator<Usuario> it= listUsuarios.iterator();it.hasNext();){     
                Usuario us=it.next();
                if(us.getUsuario().equals(user)){     //Si usuario existe en la lista se muestran las siguientes opciones
                    Desecho.showOptions(user);       //tipo de usuario como parametro para mostrar las opciones           
                }else{
                    System.out.println("Usuario no Registrado, Registrarse primero \n");
                    registrar();     
                }
        } 
        
    }
    
    public static void registrar(){
      
        Scanner sc = new Scanner(System.in);       
        System.out.println("Registro de usuarios");
        System.out.println("Ingrese el nombre del usuario");
	String nombre =sc.nextLine();
        System.out.println("Ingrese el usuario");
	String user =sc.nextLine();
        
        //Se recorre la lista de usuarios para verificar que no se registren datos duplicados de usuarios.
        try {
            
            for(Iterator<Usuario> it= listUsuarios.listIterator();it.hasNext();){     
            Usuario us=it.next();
                if(us.getUsuario().equals(user)){    //Si el usuario ya existe, se deben ingresar un usuario nuevo
                    System.out.println("Usuario Registrado ingrese un usuario diferente \n");
                    registrar();        
                }else{
                    System.out.println("Ingrese contraseña");
                    String pass =sc.nextLine();
                    Usuario usuario = new Usuario(nombre,user,pass);
                    listUsuarios.add(usuario);
                    System.out.println("Usuario Registrado  \n");
                    login();
                }
            }      
            
        } catch (java.util.ConcurrentModificationException exception) {
        // Catch ConcurrentModificationExceptions.
         
        } catch (Throwable throwable) {
            // Catch any other Throwables.
          
        }
        
    }
    
}
