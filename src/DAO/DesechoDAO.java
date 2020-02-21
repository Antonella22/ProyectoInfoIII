/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static BaseDatos.DataBase.DB;
import static BaseDatos.DataBase.TCONT_CONT;
import static BaseDatos.DataBase.*;
import static BaseDatos.DataBase.TUSUARIO_NOMBRE;
import static BaseDatos.DataBase.TUSUARIO_USUARIO;
import BaseDatos.IDBConnection;
import Control.Desecho;
import Control.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author BrnH
 */
public interface DesechoDAO extends IDBConnection{
    
    default ArrayList<Desecho> readDates(){
        
        ArrayList<Desecho> desechos= new ArrayList<>();
        try(Connection connection = conexionBd()){
        
        String query = "SELECT * FROM "+DB+".desecho;";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet rs = preparedStatement.executeQuery();                            //Ejecuta el query y trae Datos
           
        //ResultSet ayuda a iterar los datos del statemetn par aorganizarlos en objetos
        while(rs.next()){
            /*Integer cantidad = new Integer(
                    rs.getString(TDESECHO_VIDRIO),
                    rs.getString(TDESECHO_PAPEL),
                    rs.getString(TDESECHO_PLASTICO));
            usuarios.add(usuario);*/
        }
        }catch(SQLException E){
            
        }
            //rs.close();
            //preparedStatement.close();
            //connection.close();
        for(Iterator<Desecho> it= desechos.listIterator();it.hasNext();){
                    Desecho d=it.next();
                    System.out.println(""+d.getCantidad());
        } 
        return desechos;
    }
     
    
}
