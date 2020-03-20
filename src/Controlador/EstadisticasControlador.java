/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import BaseDatos.IDBConnection;
import DAO.EstadisticasDAO;
import Entidades.Reciclar;
import Entidades.Usuario;
import com.mysql.jdbc.Connection;
import javax.swing.JTable;


/**
 *
 * @author Antonella
 */
public class EstadisticasControlador implements EstadisticasDAO {
    
    public static void listOrganico(JTable tabla, String correo){
               
        Reciclar r = new Reciclar();
        r.listarSensor(tabla, correo);
    }
}
