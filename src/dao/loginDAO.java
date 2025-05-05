package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class loginDAO {
    
   public void cadastrarUsuario(String user, String senha, String email) throws SQLException {
    Connection conexao = new Conexao().getConnection();

    String sql = "INSERT INTO login (user, senha, email) VALUES (?, ?, ?)";
    PreparedStatement statement = conexao.prepareStatement(sql);
    statement.setString(1, user);
    statement.setString(2, senha);
    statement.setString(3, email);

    statement.execute();
    statement.close();  
    conexao.close();
}    
}
