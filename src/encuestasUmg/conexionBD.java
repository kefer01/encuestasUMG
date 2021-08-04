/**
 *
 * @author Kevin Oliva
 */
package encuestasUmg;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class conexionBD {
    Connection conexion = null; 
    
    
    @SuppressWarnings("UseSpecificCatch")
    
    public Connection conectarBD(){
        
    try{
        String url = "jdbc:postgresql://207.244.255.8:5432/estudiantes";
        String usuario = "usuario_prueba";
        String password = "1234";
        Class.forName("org.postgresql.Driver");
        conexion = DriverManager.getConnection(url, usuario, password);
        JOptionPane.showMessageDialog(null, "Base de datos conectada");
        
    }catch(Exception e){
      JOptionPane.showMessageDialog(null, "ERROR DE CONEXION: " + e.getMessage()); 
    }
    return conexion;
    }
    
}
