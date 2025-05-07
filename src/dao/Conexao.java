package dao;

import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class Conexao {
    
    private static final String URL = "jbdc:mysql://localhost:3306/autosign";
    private static final String USUARIO = "root";
    private static final String SENHA = "@Dudua130299";
    
    public Connection getConnection() throws SQLException{
        //"jbdc:mysql://localhost:3306/autosign?user=root&password=@Dudua130299"
        
        return DriverManager.getConnection(URL, USUARIO, SENHA);
        
    }
}
