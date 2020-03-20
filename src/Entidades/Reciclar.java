/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import DAO.EstadisticasDAO;
import DAO.ReciclarDAO;


/**
 *
 * @author Antonella
 */
public class Reciclar implements ReciclarDAO , EstadisticasDAO {

    protected int id_desecho;
    protected int cantidad;

    public Reciclar() {
    }

    public Reciclar(int id_desecho, int cantidad) {
        this.id_desecho = id_desecho;
        this.cantidad = cantidad;
    }

    
    public int getId_desecho() {
        return id_desecho;
    }

    public void setId_desecho(int id_desecho) {
        this.id_desecho = id_desecho;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
