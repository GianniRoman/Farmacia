package Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionBD {

    private Connection conexion;
    private ResultSet rs;
    private Statement s;
    private static ConexionBD db;
    
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
    
    public static ConexionBD getInstance(){    
        if(db == null)
            db = new ConexionBD();
        return db;
    }
    
    public int Insert(String tabla, String valor)
    {
        int exito = 0;
        try{
             db.conexion.createStatement();
             exito = db.s.executeUpdate(("insert into "+tabla+" values ("+valor+")"));
        }catch(SQLException ex)
        {
            System.out.println(ex);
        }
        return exito;
    }
    
    public ResultSet Select(String atributos, String from, String where)
    {
        try{
             db.conexion.createStatement();
             if("".equals(where))
             {
                 db.setRs(db.s.executeQuery("Select "+atributos+" from "+from));
                 
             }else{
                 db.setRs(db.s.executeQuery("Select "+atributos+" from "+from+" where "+where));
             }
        }catch(SQLException ex)
        {
            System.out.println(ex);
        }
        
        return this.rs;
    }
    
    public int Update(String from, String columValue, String where)
    {
        try{
            db.conexion.createStatement();
            db.s.executeUpdate("Update "+from+" set "+columValue+"where "+where);
        }catch(SQLException ex)
        {
            System.out.println("Update :"+ex);
        }
        return 0;
    }
    
    public int Delete(String from, String where)
    {
        int exito = 0;
        try{
             db.conexion.createStatement();
             exito = db.s.executeUpdate(("Delete from "+from+" where "+where));             
        }catch(SQLException ex)
        {
            System.out.println(ex);
        }
        return exito;
    }
    
    public Connection getConexion() {
        
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
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
