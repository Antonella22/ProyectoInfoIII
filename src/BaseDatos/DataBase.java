/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaseDatos;

/**
 *
 * @author BrnH
 */
public class DataBase {
    
    //Datos generales conexion a  BD
    public static final String URL 		= "jdbc:mysql://localhost:3306/";
    public static final String DB 		= "IT?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public static final String USER             = "telematica";
    public static final String PASSWORD         = "telematica";

    //Tabla Usuario
    public static final String TUSUARIO		= "usuario";
    public static final String TUSUARIO_ID	= "id";
    public static final String TUSUARIO_NOMBRE 	= "nombre";
    public static final String TUSUARIO_USUARIO	= "usuario";
    public static final String TCONT_CONT        = "contraseña";
    
    //Tabla desecho
    public static final String TDESECHO 	= "desecho";
    public static final String TDESECHO_ID 	= "id";
    public static final String TDESECHO_VIDRIO 	= "vidrio";
    public static final String TDESECHO_PAPEL 	= "pape";
    public static final String TDESECHO_PLASTICO= "plastico";
    public static final String TDESECHO_ORGANICO= "organico";
    
   
}
