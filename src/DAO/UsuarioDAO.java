/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BaseDatos.DataBase;
import static BaseDatos.DataBase.*;
import BaseDatos.IDBConnection;
import Entidades.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author BrnH
 */
public interface UsuarioDAO extends IDBConnection {
    
    
    default ArrayList<Usuario> readDates(){
        
        ArrayList<Usuario> usuarios = new ArrayList<>();
        
        try(Connection connection = conexionBd()){
        
        String query = "SELECT * FROM reciclaje.usuario;";
        System.out.println(query);
        
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet rs = preparedStatement.executeQuery();                            //Ejecuta el query y trae Datos
           
        //ResultSet ayuda a iterar los datos del statemetn para organizarlos en objetos
        while(rs.next()){
            Usuario usuario = new Usuario(  
                    rs.getString(CORREO),
                    rs.getString(NOMBRE_USUARIO),
                    rs.getString(CONTRASENA_USUARIO));
            usuarios.add(usuario);
            rs.close();
            preparedStatement.close();
            connection.close();
        }
        }catch(SQLException E){
            
        }
        return usuarios;
    }
     
      default boolean loginUsuario(Usuario usuario){
          
        boolean b=false;
        String correo= null;
        String contrasena= null;
   
        try(Connection connection = conexionBd()){
            //SELECT usuario FROM datainfo.usuario where usuario="HH";
            String query = "SELECT CORREO,CONTRASENIA_USUARIO FROM reciclaje.usuario where CORREO=?";
            System.out.println(query);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, usuario.getCorreo());
            ResultSet rs = preparedStatement.executeQuery();                            //Ejecuta el query y trae Datos
            
            //ResultSet ayuda a iterar los datos del statemetn para organizarlos en objetos
            while(rs.next()){
                    correo=rs.getString(CORREO);
                    contrasena=rs.getString(CONTRASENA_USUARIO); 
                    
            }
            
            System.out.println(""+correo);
            if(correo.equals(usuario.getCorreo()) && contrasena.equals(usuario.getPasswd())){
                b=true;
            }
            if(correo== null){
                b=false;
            }
                     
            rs.close();
            preparedStatement.close();
            connection.close();
           
        }catch(SQLException E){
            
        }
        return b;
    }
          
    default boolean register(Usuario usuario){
        
        boolean b=false;
        String correo="";
        try(Connection connection = conexionBd()){
            
            String query = "SELECT CORREO FROM reciclaje.usuario where CORREO=?";
            System.out.println(query);
            //Statement statement = connection.createStatement(); 	//crear objeto para ejecutar acciones en bd  
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, usuario.getCorreo());
            ResultSet rs = preparedStatement.executeQuery();                            //Ejecuta el query y trae Datos
            
            //ResultSet ayuda a iterar los datos del statemetn para organizarlos en objetos
            while(rs.next()){
                correo=rs.getString(CORREO);      
            }
            
            if(correo==""){
                
                PreparedStatement pS=null;

                String query2 = "INSERT INTO usuario (CORREO,NOMBRE_USUARIO, CONTRASENIA_USUARIO,TIPO_USUARIO)VALUES (?,?,?,?)";
                System.out.println(query2);

               //Statement sT = connection.createStatement(); 	//crear objeto para ejecutar acciones en bd  
                pS = connection.prepareStatement(query2);

                pS.setString(1, usuario.getCorreo());
                pS.setString(2, usuario.getNombre());
                pS.setString(3, usuario.getPasswd());
                pS.setString(4, "comun");
                pS.execute();
                pS.close();

                b=true;

               // sT.close();
                pS.close();
            }
            
            preparedStatement.close();
            connection.close();
            
        } catch (SQLException e) {
                e.printStackTrace();
        }
        return b;
    }   
}