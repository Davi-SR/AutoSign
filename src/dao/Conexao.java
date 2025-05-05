package dao;

import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class Conexao {
    
    public Connection getConnection(){
        
        Connection conexao = null;
        
       try{ 
           String url = "jbdc:mysql://localhost:3306/autosign?user=root&password=@Dudua130299";
           conexao = DriverManager.getConnection(url);
          
       }catch(SQLException erro){
           JOptionPane.showMessageDialog(null, "conexaoDAO" + erro.getMessage());
       }
       return conexao;
    }
}
