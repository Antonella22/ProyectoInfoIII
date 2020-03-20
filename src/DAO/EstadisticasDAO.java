/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import BaseDatos.IDBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Antonella
 */
public interface EstadisticasDAO extends IDBConnection {
    

    default void listarSensor(JTable table, String correo){  
         
        DefaultTableModel model;
        String [] columnas ={"Tipo desecho", "Cantidad"};
        model = new DefaultTableModel(null, columnas);
        String [] filas = new String[2];
        ResultSet rs = null;        
             
        String sql = "SELECT organico.TIPO_ORGANICO FROM `organico` JOIN (SELECT ID_DESECHO FROM `recicla` WHERE CORREO =?) AS idO WHERE idO.ID_DESECHO = organico.ID_DESECHO";
          
        try(Connection con = conexionBd()){
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1, correo);
        rs = pst.executeQuery();
        
            while(rs.next()){
                for(int i = 0;i<=1 ;i++)
                {
                    filas[i]=rs.getString(i+1);
                }
                model.addRow(filas);

            }

            System.err.println(rs);
            table.setModel(model);

        } catch (SQLException ex) {
          // System.err.println("Error al preparar la consulta");
            ex.printStackTrace();
        }

    }
    
}

