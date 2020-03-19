/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.UsuarioDAO;
import Entidades.Usuario;

/**
 *
 * @author BrnH
 */
public class UsuarioControlador implements UsuarioDAO {
    
    public static  boolean registrarUsuario(String txtCorreo,String txtNombre,String txtPassword){
        
        boolean b=false;
        Usuario usuario = new Usuario(txtCorreo,txtNombre,txtPassword);    
        b=usuario.register(usuario);    
        
        return b;
    }
    
    public static boolean loginAuth(String txtCorreo,String txtPassword ){

    boolean b=false;
    Usuario usuario = new Usuario(txtCorreo,txtPassword);

    b=usuario.loginUsuario(usuario);

    return b;
    }
}
