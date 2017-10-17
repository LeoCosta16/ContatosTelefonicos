
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectionFactory {
    
     //private static final String DRIVER =  "org.sqlite.jdbc";
     //private static final String URL = "jdbc:sqlite:G:/Projeto/ContatosTelefonicos.db";
    
   public Connection getConnection() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:D:/Programacao/Java/Projeto1/ContatosTelefonicos-master/ContatosTelefonicos.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
            
            //System.out.println("Connection to SQLite has been established.");
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return conn;
        }
}
    
   /*
    public static void closeConnection(Connection conn){
        
            try {
                if(conn != null){
                conn.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }            
    
   public static void closeConnection(Connection conn, PreparedStatement stmt){
        
       closeConnection(conn);
       
            try {
                    if (stmt != null && ! stmt.isClosed()){
                        stmt.close();                
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }     
    
   public static void closeConnection(Connection conn, PreparedStatement stmt, ResultSet rs){
        
       closeConnection(conn,stmt);
       
            try {
                    if(rs != null){
                        rs.close();                
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
}
*/
   