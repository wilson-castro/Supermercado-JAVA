/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabrica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Aluno 18
 */
public class ConexaoFabrica {
    
     public Connection getConnection() {
		 try {
			return DriverManager.getConnection("jdbc:mysql://localhost/cadastro","root","");
		 }         
		 catch(SQLException excecao) {
			throw new RuntimeException(excecao);
		 }
     }
    
}
