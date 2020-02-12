/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import static BaseDatos.DataBase.*;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author BrnH
 */
public interface IDBConnection {
    
    default Connection conexionBd(){        //Generar conexion y retornar instancia de la sesión
        
        Connection connection= null; 
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");      //Llamar al diver seleccionado llamado como paquete
            connection = DriverManager.getConnection(URL+DB,USER,PASSWORD);     //Clase Driver Manager xra obtener conexion a Bd, con la direccion de Bd, puertos mySql 3306
            
            if(connection!=null){
                System.out.println("---- Conexion establecida ------");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            return connection;
        }
    }
}
