/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import DAO.ReciclarDAO;
import Entidades.Reciclar;
import Entidades.Usuario;

/**
 *
 * @author BrnH
 */

public class ReciclarControlador implements ReciclarDAO {
    
    
    public static String agregarDes(Reciclar rec,String correo){
        
        String msj;
        
        if(rec.buscarDesecho(correo, rec.getId_desecho())){
            msj = rec.modificarCantidad(rec, correo);
        }else{
            msj = rec.agregarDesecho(rec, correo);
        }
        
        return msj;
    }
        
}
