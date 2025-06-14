package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDAO {

    // Método para cadastrar um novo usuário no banco de dados
    public boolean cadastrarUsuario(String nome, String email, String senha) {
        
        String sql = "INSERT INTO login (nome, email, senha) VALUES (?, ?, ?)";

        try (Connection conexao = new Conexao().getConnection();
      
            PreparedStatement statement = conexao.prepareStatement(sql)) {
            statement.setString(1, nome); 
            statement.setString(2, email);
            statement.setString(3, senha); 
            statement.executeUpdate();
            return true; 

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    // Método para logar com o usuario cadastrado no banco de dados
    public boolean login(String email, String senha) {
   
        String sql = "SELECT email, senha FROM login WHERE email = ? AND senha = ?";

        try (Connection conexao = new Conexao().getConnection();
             PreparedStatement statement = conexao.prepareStatement(sql)) {

            statement.setString(1, email);
            statement.setString(2, senha);

            try (ResultSet rs = statement.executeQuery()) {
                if (rs.next()) {
                    System.out.println("Usuário cadastrado no sistema");
                    return true;
                } else {
                    System.out.println("Usuário não cadastrado no sistema");
                    return false;
                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}