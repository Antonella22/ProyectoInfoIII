/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import static BaseDatos.DataBase.CORREO;
import static BaseDatos.DataBase.DB;
import BaseDatos.IDBConnection;
import Entidades.Reciclar;
import Entidades.Usuario;
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
public interface ReciclarDAO extends IDBConnection{
    
    default ArrayList<Reciclar> readDates(String correo){
        
        ArrayList<Reciclar> recicla= new ArrayList<>();
        try(Connection connection = conexionBd()){
        
        String query = "SELECT * FROM reciclaje.recicla where CORREO=?";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, correo);
        ResultSet rs = preparedStatement.executeQuery();                            //Ejecuta el query y trae Datos
           
        //ResultSet ayuda a iterar los datos del statemetn par aorganizarlos en objetos
        while(rs.next()){
            Reciclar reciclaje= new Reciclar(
                    rs.getInt("ID_DESECHO"),
                    rs.getInt("CANTIDAD_DESECHO"));
            recicla.add(reciclaje);
        }
        rs.close();
        preparedStatement.close();
        connection.close();
        
        }catch(SQLException E){
            
        }
        return recicla;
    }
    

    default boolean buscarDesecho(String correo, int id){
        
        String msj;
        String usu = null;
        int id_desecho = 0;
        boolean a =  false;
        
        try(Connection con = conexionBd()){
            
            PreparedStatement pst=null;        
            String sql= "SELECT * FROM `recicla` WHERE CORREO = ? AND ID_DESECHO = ?";
        
            pst= con.prepareStatement(sql);
            pst.setString(1, correo);
            pst.setInt(2, id);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                usu = rs.getString("CORREO");
                id_desecho = rs.getInt("ID_DESECHO");
            }
            
            pst.execute();
            pst.close();
            
            if(usu != null && id_desecho != 0){
                System.out.println("El Desecho existe");
                a = true;
            }else{
                a = false;
            }
               
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
            //return msj; 
             return a;
    }

    default String agregarDesecho(Reciclar re, String correo){
        
        String msj;
        
        try(Connection con = conexionBd()){
        
        PreparedStatement pst=null;
        String sql= "INSERT INTO reciclaje.recicla (`CORREO`, `ID_DESECHO`, `CANTIDAD_DESECHO`) VALUES (?, ?, ?)";
        
                pst=con.prepareStatement(sql);
                pst.setString(1, correo);
                pst.setInt(2, re.getId_desecho());
                pst.setInt(3, re.getCantidad());
            
                pst.execute();
                pst.close();
                msj="Desecho Guardo correctamente";
       
        } catch (Exception e) {
            msj="Error al guardar "+e.getMessage();
            e.printStackTrace();
        }
        return msj;
    }
    
     default String modificarCantidad(Reciclar res, String correo){
        
        String msj;
        int cantidad=0;
        try(Connection con = conexionBd()){
            
        String query = "SELECT CANTIDAD_DESECHO FROM reciclaje.recicla where CORREO=? AND ID_DESECHO=?";
        System.out.println(query);
        //Statement statement = connection.createStatement(); 	//crear objeto para ejecutar acciones en bd  
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.setString(1, correo);
        preparedStatement.setInt(2, res.getId_desecho());
        
        ResultSet rs = preparedStatement.executeQuery();                            //Ejecuta el query y trae Datos
       
        //ResultSet ayuda a iterar los datos del statemetn para organizarlos en objetos
        while(rs.next()){
            cantidad=rs.getInt("CANTIDAD_DESECHO");         
        }
        
        PreparedStatement pst=null;
        String sql= "UPDATE RECICLA SET CANTIDAD_DESECHO = ? WHERE CORREO = ? AND ID_DESECHO = ?";
               //UPDATE RECICLA SET cantidad_desecho = "1" WHERE correo = "antonella@unicauca.edu.co" AND ID_DESECHO = "13"
        
            pst=con.prepareStatement(sql);
            pst.setInt(1, res.getCantidad()+cantidad);
            pst.setString(2, correo);
            pst.setInt(3, res.getId_desecho());
            //pst.execute();
            pst.executeUpdate();
            pst.close();
            msj="Editado";
            
        } catch (Exception e) {
            msj="Error al Editar "+e.getMessage();
        }
        return msj;
    }  
     
}
