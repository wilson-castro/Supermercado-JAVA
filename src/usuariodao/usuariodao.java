


package usuariodao;


import conexao.*;
import java.util.List;
import main.main;
import java.sql.*;


public class usuariodao {
    
    
    
    private Connection connection;
    
  public void adiciona(main usuario){ 
        Connection con =  ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String sql = "INSERT INTO usuario VALUES(?,?,?,?)";
        try { 
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getSenha());
            stmt.setString(3, usuario.getUsuario());
            stmt.setString(4, usuario.getTipo());
            
            stmt.executeUpdate();
        } 
        catch (SQLException u) { 
            System.out.println("erro : "+u);
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
        
       
     
        
    }
  
  public List<main> read(){
      Connection con= ConnectionFactory.getConnection();
      PreparedStatement stat = null;
      ResultSet rs = null;
      
      List<main> = new ArrayList<>();
      
    }
}
