import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class BancoDeDados {
    
    private int id = -1;
    private int quantContatos;
    private String nome[] = new String[100];
    private String numero[] = new String[50];
    private String email[] = new String[100];
    private String grupo[] = new String[100];

    public int getQuantContatos() {
        return quantContatos;
    }

    public void setQuantContatos(int quantContatos) {
        this.quantContatos = quantContatos;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome[id];
    }

    public void setNome(String nome) {
        this.nome[id] = nome;
    }

    public String getNumero() {
        return numero[id];
    }

    public void setNumero(String numero) {
        this.numero[id] = numero;
    }

    public String getEmail() {
        return email[id];
    }

    public void setEmail(String email) {
        this.email[id] = email;
    }

    public String getGrupo() {
        return grupo[id];
    }

    public void setGrupo(String grupo) {
        this.grupo[id] = grupo;
    }
    
    public Connection connect() {
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
      
        public void insereDados (Connection conn) {
        
        String sql = "INSERT INTO contato VALUES(?,?,?,?,?)";
        
        try {
                PreparedStatement pstmt = conn.prepareStatement(sql);
                
                //pstmt.setInt(1, id);
                pstmt.setString(2, nome[id]);
                pstmt.setString(3, numero[id]);
                pstmt.setString(4, email[id]);
                pstmt.setString(5, grupo[id]);
                
                pstmt.executeUpdate();
                
        } catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
        
        public void selecionaDados (Connection conn) {
            
        String sql = "SELECT * "
                     + "FROM contato;"
                     + " WHERE id = " + id + ";";
        
        try {
            
            Statement comandoSql = conn.createStatement();
            
            ResultSet rs = comandoSql.executeQuery(sql);
            
            //loop no resultado
            while (rs.next()) {
                    this.id = rs.getInt("id");
                    this.nome[id] = rs.getString("nome");
                    this.numero[id]  = rs.getString("numero");
                    this.email[id] = rs.getString("email");
                    this.grupo[id] = rs.getString("grupo");
         
                    System.out.println( "ID = " + this.id );
                    System.out.println( "NOME = " + this.nome[id] );
                    System.out.println( "NUMERO = " + this.numero[id] );
                    System.out.println( "EMAIL = " + this.email[id] );
                    System.out.println( "GRUPO = " + this.grupo[id] );
                    System.out.println();
                }
        }catch (SQLException e) {
            System.out.println(e.getMessage());
            }
        
        }
        
        public void atualizaDados(Connection conn) {
            
            Statement stmt = null;
            
            try {
                Class.forName("org.sqlite.JDBC");
                conn = DriverManager.getConnection("jdbc:sqlite:ContatosTelefonicos.db");
                conn.setAutoCommit(false);
                System.out.println("Opened database successfully");

                stmt = conn.createStatement();
                String sql = "UPDATE contato"
                         + " SET nome = '" + nome[id]
                         + "', numero = '" + numero[id] 
                         + "', email = '" + email[id] 
                         + "', grupo = '" + grupo[id] + "'"
                         + " WHERE id = " + id + ";";
                stmt.executeUpdate(sql);
                conn.commit();

                ResultSet rs = stmt.executeQuery( "SELECT * FROM contato;" );
      
                while ( rs.next() ) {
                    this.id = rs.getInt("id");
                    this.nome[id] = rs.getString("nome");
                    this.numero[id]  = rs.getString("numero");
                    this.email[id] = rs.getString("email");
                    this.grupo[id] = rs.getString("grupo");
         
                    System.out.println( "ID = " + this.id );
                    System.out.println( "NOME = " + this.nome[id] );
                    System.out.println( "NUMERO = " + this.numero[id] );
                    System.out.println( "EMAIL = " + this.email[id] );
                    System.out.println( "GRUPO = " + this.grupo[id] );
                    System.out.println();
                }
                rs.close();
                stmt.close();
                conn.close();
             } catch ( Exception e ) {
                System.err.println( e.getClass().getName() + ": " + e.getMessage() );
                System.exit(0);
             }
              System.out.println("Alterações feitas com sucesso!");
              id = quantContatos;
              System.out.println("Quantidade de contatos(dados): " + quantContatos);
            }
        
            public static void main(String[] args) {

            }
    }
        
