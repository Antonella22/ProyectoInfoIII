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

/**
 *
 * @author BrnH
 */
public interface UsuarioDAO extends IDBConnection {
    
    
    default ArrayList<Usuario> readDates(){
        
        ArrayList<Usuario> usuarios = new ArrayList<>();
        /*try(Connection connection = conexionBd()){
        
        String query = "SELECT * FROM " + TUSUARIO;
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet rs = preparedStatement.executeQuery();                            //Ejecuta el query y trae Datos
           
        //ResultSet ayuda a iterar los datos del statemetn par aorganizarlos en objetos
        while(rs.next()){
            Usuario usuario = new Usuario(
                    rs.getString(TUSUARIO_NOMBRE),
                    rs.getString(TUSUARIO_USUARIO),
                    rs.getString(TCONT_CONT));
            usuarios.add(usuario);
        }
        }catch(SQLException E){
            
        }*/
        usuarios.add(new Usuario("admin","admin","admin"));
        return usuarios;
    }
     
    default byte register(Usuario usuario){
        byte b=0;
        /*try(Connection connection = conexionBd()){
          Statement statement = connection.createStatement(); 	//crear objeto para ejecutar acciones en bd
          String query = "INSERT INTO " + TUSUARIO +
                                            "("+TUSUARIO_NOMBRE+","+TUSUARIO_USUARIO+","+TCONT_CONT+")"+
                                            "VALUES("+usuario.getNombre()+", "+usuario.getUsuario()+", "+usuario.getPasswd()+")";
        if(statement.executeUpdate(query)>0){			//Cantidad de rows afectadas
           b=1;
	}else{
           b=0;
        }
			
        } catch (SQLException e) {
                e.printStackTrace();
        }*/
        b=1;
        return b;
    }   
}
