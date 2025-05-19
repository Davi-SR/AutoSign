package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class SalaDAO {
    
    //Conexão com a tabela de sala
    public boolean cadastrarSala(String bloco, int numero) {
        String sql = "INSERT INTO sala (numero, bloco) VALUES (?,?)";
        
        try (Connection conexao = new Conexao().getConnection();
             PreparedStatement ps = conexao.prepareStatement(sql)) {
            
            ps.setInt(1, numero);
            ps.setString(2, bloco);
            ps.executeUpdate();
            return true;
            
        } catch (SQLException e) {
            e.printStackTrace();
                return false;
            }
        
    }
    
}
