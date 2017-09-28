package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBD {

    private static Connection conexion;
    private ResultSet rs;
    private Statement s;
    
    private ConexionBD(){
        rs = null;
        s = null; 
        String url = "jdbc:postgresql://localhost:5432/Farmacia";
        String password = "warcraft1";
        String user = "postgres";
        try{
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url,user,password); 
            if(conexion == null)
            {
                System.out.println("no se conecto");
            }else{
                System.out.println("se conecto");
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e.getMessage());            
        }    
    }
    
    public ConexionBD getInstance(){
        
        if(conexion == null)
        {
            ConexionBD nuevaConexion = new ConexionBD();
            return nuevaConexion;
        }else{
            
        }
        return null;
    }
    
    public static Connection getConexion() {
        
        return ConexionBD.conexion;
    }

    public static void setConexion(Connection conexion) {
        ConexionBD.conexion = conexion;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public Statement getS() {
        return s;
    }

    public void setS(Statement s) {
        this.s = s;
    }
    
}
