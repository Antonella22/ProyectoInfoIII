/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BaseDatos.DataBase;
import static BaseDatos.DataBase.*;
import BaseDatos.IDBConnection;
import Control.Usuario;
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
        
        String query = "SELECT * FROM "+DB+".usuario;";
        System.out.println(query);
        
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet rs = preparedStatement.executeQuery();                            //Ejecuta el query y trae Datos
           
        //ResultSet ayuda a iterar los datos del statemetn par aorganizarlos en objetos
        while(rs.next()){
            Usuario usuario = new Usuario(
                    rs.getString(TUSUARIO_NOMBRE),
                    rs.getString(TUSUARIO_USUARIO),
                    rs.getString(TCONT_CONT));
            usuarios.add(usuario);
            rs.close();
            preparedStatement.close();
            connection.close();
        }
        }catch(SQLException E){
            
        }
        for(Iterator<Usuario> it= usuarios.listIterator();it.hasNext();){
                    Usuario us=it.next();
                    System.out.println(""+us.getNombre());
        } 
        return usuarios;
    }
     
      default boolean verificarUsuario(String usuario){
          
        boolean b=false;
        
        try(Connection connection = conexionBd()){
            //SELECT usuario FROM datainfo.usuario where usuario="HH";
            String query = "SELECT "+TUSUARIO_USUARIO+" FROM "+DB+".usuario where "+TUSUARIO_USUARIO+"='"+usuario+"';";
            System.out.println(query);
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            ResultSet rs = preparedStatement.executeQuery();                            //Ejecuta el query y trae Datos

            //ResultSet ayuda a iterar los datos del statemetn par aorganizarlos en objetos
            while(rs.next()){
                String us= new String(rs.getString(TUSUARIO_USUARIO));
                System.out.println(""+us);

                if(us==""){
                    b=false;
                }else{
                    b=true;
                }

                rs.close();
                preparedStatement.close();
                connection.close();
            }
           
        }catch(SQLException E){
            
        }
        return b;
    }
      
     default boolean verificarLogin(String usuario, String contraseña){
            
        boolean b = false;
        
        try(Connection connection = conexionBd()){
        // SELECT usuario, contraseña FROM datainfo.usuario where usuario="anto"; 
        String query = "SELECT "+TUSUARIO_USUARIO+","+TCONT_CONT+""+" FROM "+DB+"."+TUSUARIO_USUARIO+" where "+TUSUARIO_USUARIO+"='"+usuario+"';";
        System.out.println(query);
        
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet rs = preparedStatement.executeQuery();                            //Ejecuta el query y trae Datos
           
            //ResultSet ayuda a iterar los datos del statemetn par aorganizarlos en objetos
            while(rs.next()){
                String us= new String(rs.getString(TUSUARIO_USUARIO));
                String cont= new String(rs.getString(TCONT_CONT));
 
                System.out.println(""+us + "" +cont);

                if(us.equals(usuario)){ 
                    if(cont.equals(contraseña)){
                        b=true;
                    }else{
                        b=false;
                    }
                }
                rs.close();
                preparedStatement.close();
                connection.close();
            }
       
        }catch(SQLException E){
            
        }
        
        return b;
    }
     
    default byte register(Usuario usuario){
        byte b=0;
        try(Connection connection = conexionBd()){
          Statement statement = connection.createStatement(); 	//crear objeto para ejecutar acciones en bd       
          String query = "INSERT INTO " + TUSUARIO + " ("+TUSUARIO_ID+","+TUSUARIO_NOMBRE+","+TUSUARIO_USUARIO+","+TCONT_CONT+")"
                                    +"VALUES (NULL,'"+usuario.getNombre()+"','"+usuario.getUsuario()+"','"+usuario.getPasswd()+"');";
           System.out.println(query);
           
           if(statement.executeUpdate(query)>0){			//Cantidad de rows afectadas
               b=1;
           }
            statement.close();
            connection.close();
           
        } catch (SQLException e) {
                e.printStackTrace();
        }
        return b;
    }   
}