/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuariodao;

   
import conexao.*;
import java.awt.List;
import main.main_prod;
import java.sql.*;
import java.sql.Connection;
import java.util.ArrayList;

public class produtodao {
     private Connection connection;
      public void adiciona(main_prod produto){ 
        Connection con =  ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        String sql = "INSERT INTO produto(nome,quantidade,preco) VALUES(?,?,?)";
        try { 
            stmt = con.prepareStatement(sql);
            
            stmt.setString(1, produto.getNome_prod());
            stmt.setString(2, produto.getQuantidade());
            stmt.setString(3, produto.getPreco());
            
            stmt.executeUpdate();
        } 
        catch (SQLException u) { 
            System.out.println("erro : "+u);
        }finally{
            ConnectionFactory.closeConnection(con,stmt);
        }
        
     
}

}
