
package conexao;

import java.sql.*;

import java.util.logging.Level;
import java.util.logging.Logger;


public class ConnectionFactory {
    
    private final static String DRIVER = "com.mysql.jdbc.Driver";
    private final static String URL = "jdbc:mysql://Localhost:3306/test";
    private final static String USER = "root";
    private final static String PASS = "";
    
    public static Connection getConnection(){
        
        try {
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL,USER,PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("ERRO NA CONEXÃO : ", ex);
        }
        
    }
    
    public static void closeConnection(Connection con){
        
            try {
                if(con!=null){
                con.close();
                        
                }
            } catch (SQLException ex) {
                Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
            }
    }

    public static void closeConnection(Connection con,PreparedStatement stmt){

        closeConnection(con);
        
        try {
            
            if (stmt!=null) {
                stmt.close();
            }
          
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void closeConnection(Connection con,PreparedStatement stmt,ResultSet rs){

      closeConnection(con,stmt);

      try {

          if (rs!=null) {
              rs.close();
          }

      } catch (SQLException ex) {
          Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
      }
  }
    
}
