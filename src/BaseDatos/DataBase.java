/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

import java.util.ArrayList;

/**
 *
 * @author BrnH
 */
public class DataBase {
    
    //Datos generales conexion a  BD
    public static final String URL 		= "jdbc:mysql://localhost:3306/";
    public static final String DB 		= "reciclaje";//?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String USER             = "telematica";
    public static final String PASSWORD         = "ttm123";

    //Tabla Usuario
    public static final String USUARIO		= "usuario";
    public static final String CORREO           = "CORREO";
    public static final String NOMBRE_USUARIO	= "NOMBRE_USUARIO";
    public static final String CONTRASENA_USUARIO= "CONTRASENIA_USUARIO";
    public static final String TIPO_USUARIO      = "TIPO_USUARIO";
    
    //tabla recicla
    
    
    //Tabla desecho
    public static final String TDESECHO 	= "desecho";
    public static final String TDESECHO_ID 	= "id";
    public static final String TDESECHO_VIDRIO 	= "vidrio";
    public static final String TDESECHO_PAPEL 	= "pape";
    public static final String TDESECHO_PLASTICO= "plastico";
    public static final String TDESECHO_ORGANICO= "organico";
    
     //public static final String query = "SELECT usuario FROM datainfo.usuario where usuario=?";
    
}
