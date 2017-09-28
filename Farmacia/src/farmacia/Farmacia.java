package farmacia;

import Interfaces.Login;
import Conexion.ConexionBD;

public class Farmacia {
  
    public static void main(String[] args) {
        //new Login().setVisible(true);
        ConexionBD nuevaconexion = ConexionBD.getInstance();
        System.out.println(nuevaconexion.getConexion());
        ConexionBD otra = ConexionBD.getInstance();
        System.out.println(otra.getConexion());
        
    }
    
}
