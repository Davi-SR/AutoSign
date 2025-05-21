package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProfessorDAO {

    //Conexão da tabela Professor
    public boolean cadastrarProfessor(String nome, String matricula) {
        String sql = "INSERT INTO professor (nome, matricula) VALUES (?, ?)";

        try (Connection conexao = new Conexao().getConnection();
             PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setString(1, nome);
            ps.setString(2, matricula);
            ps.executeUpdate();
            return true;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
}
