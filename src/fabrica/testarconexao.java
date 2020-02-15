/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author Aluno 18
 */
public class testarconexao {

    
    public static void main(String[] args) throws SQLException {
         Connection connection = new ConexaoFabrica().getConnection();
         System.out.println("Conexão aberta!");
         connection.close();
     }
    

}
