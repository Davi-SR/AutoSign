package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//Classe responsável por fornecer a conexão com o banco de dados MySQL
public class Conexao {

    private static final String URL = "jdbc:mysql://localhost:3306/autosign";
    private static final String USUARIO = "root";
    private static final String SENHA = "@Dudua130299";

    public Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar com o banco" + e.getMessage());
            return null;
        }
    }
}