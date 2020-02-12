/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static BaseDatos.DataBase.*;
import BaseDatos.IDBConnection;
import Control.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author BrnH
 */
public interface UsuarioDAO extends IDBConnection {
    
    default ArrayList<Usuario> read(){
        
        ArrayList<Usuario> usuarios = new ArrayList<>();
        try(Connection connection = conexionBd()){
        
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
            
        }
        return usuarios;
    }
    
}
