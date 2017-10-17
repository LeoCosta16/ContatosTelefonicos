
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ContatoDAO {
    
    public void criaTabela (Connection conn) {
        
        String sql = "CREATE TABLE IF NOT EXISTS contato(";
                sql += "id           int PRIMARY KEY,";
                sql += "nome         char(100) NOT NULL,";
                sql += "numero       char(10) NOT NULL,";
                sql += "email        char(30),";
                sql += "grupo        char(30)";
                sql += ");";
        
        try {
                Statement stmt = conn.createStatement();
                
            // cria uma tabela
            stmt.execute(sql);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void insereDados(Connection conn, Contato c){
       
        PreparedStatement stmt = null;
       
        try {
            stmt = conn.prepareStatement("INSERT INTO contato(id, nome,numero,email,grupo)VALUES(?,?,?,?,?)");
            
            stmt.setInt(1, c.getId());
            stmt.setString(2, c.getNome());
            stmt.setString(3, c.getNumero());
            stmt.setString(4, c.getEmail());
            stmt.setString(5, c.getGrupo());
            
            stmt.executeUpdate();
                      
        } catch (SQLException ex) {
            Logger.getLogger(ContatoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
   }
    
    public ArrayList selecionaDados(Connection conn){

    PreparedStatement stmt = null;
    ResultSet rs = null;
    
    ArrayList contatos = new ArrayList();

        try {
            
            stmt = conn.prepareStatement("SELECT * FROM contato");
            rs = stmt.executeQuery();
            
            while(rs.next()){
                
                Contato contato = new Contato();
                
                contato.setId(rs.getInt("id"));
                contato.setNome(rs.getString("nome"));
                contato.setNumero(rs.getString("numero"));
                contato.setEmail(rs.getString("email"));
                contato.setGrupo(rs.getString("grupo"));
                contatos.add(rs.getString("nome"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ContatoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return contatos;

    }
    
    
     public void alteraDados(Connection conn, Contato c){
       
        PreparedStatement stmt = null;
       
        try {
            stmt = conn.prepareStatement("UPDATE contato SET nome = ?,numero = ?,email = ?,grupo = ? WHERE id = ?");
            
            stmt.setString(1,c.getNome());
            stmt.setString(2, c.getNumero());
            stmt.setString(3, c.getEmail());
            stmt.setString(4, c.getGrupo());
            stmt.setInt(5, c.getId());
            
            stmt.executeUpdate();
                      
        } catch (SQLException ex) {
            Logger.getLogger(ContatoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
    public void deletaDados(Connection conn, Contato c){
       
        PreparedStatement stmt = null;
       
        try {
            stmt = conn.prepareStatement("DELETE FROM contato WHERE id = ?");
            
            stmt.setInt(1, c.getId());
            
            stmt.executeUpdate();
                      
        } catch (SQLException ex) {
            Logger.getLogger(ContatoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
     
}


