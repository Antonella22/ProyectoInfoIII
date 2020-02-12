/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import DAO.UsuarioDAO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Antonella
 */
public class Usuario implements UsuarioDAO {
    
    protected String nombre;
    protected String usuario;
    protected String passwd;
    //public ArrayList <Usuario> listUsuarios = new ArrayList<>();   
    static ArrayList <Usuario> listUs;
    
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

    public static ArrayList<Usuario> listaUsuarios(){
        Usuario usuario = new Usuario();
		
	return usuario.read();	
    }
    
    public static boolean registrarUsuario(){
        
        return true; //usuario.register();
    }
    
    public static boolean loginAuth(String txtUser,String txtPassword ){
         
        listUs =  listaUsuarios();
        
        for(Iterator<Usuario> it=listUs.iterator();it.hasNext();){     
        Usuario us=it.next();
            if(us.getUsuario().equals(txtUser) && us.getPasswd().equals(txtPassword)){     //verificar si usuario existe en lista
                    //this.isVisible(false);
                    //Seleccion.isVisible(true)
                return true;
            }else{
                    //Register.isVisible(true);     
            }
        }
        return true;
    }
    
    public static void login(){
        
        listUs = listaUsuarios();
        System.out.println("Ingresar Usuario");
        Scanner sc = new Scanner(System.in);
	String user=sc.nextLine();
        
        //Recorrer y buscar usuario en lista para verificar existencia.
        for(Iterator<Usuario> it= listUs.iterator();it.hasNext();){     
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
      
        listUs = listaUsuarios();
        
        Scanner sc = new Scanner(System.in);       
        System.out.println("Registro de usuarios");
        System.out.println("Ingrese el nombre del usuario");
	String nombre =sc.nextLine();
        System.out.println("Ingrese el usuario");
	String user =sc.nextLine();
        
        //Se recorre la lista de usuarios para verificar que no se registren datos duplicados de usuarios.
        try {
            
            for(Iterator<Usuario> it= listUs.listIterator();it.hasNext();){     
            Usuario us=it.next();
                if(us.getUsuario().equals(user)){    //Si el usuya existe, se deben ingresar un usuario nuevo
                    System.out.println("Usuario Registrado ingrese un usuario diferente \n");
                    registrar();        
                }else{
                    System.out.println("Ingrese contraseña");
                    String pass =sc.nextLine();
                    Usuario usuario = new Usuario(nombre,user,pass);
                    listUs.add(usuario);
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
