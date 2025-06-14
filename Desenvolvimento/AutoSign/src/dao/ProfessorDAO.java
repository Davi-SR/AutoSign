package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDAO {
    
    public int buscarIdPorNome(String nome) throws SQLException {
        String sql = "SELECT id FROM professor WHERE nome = ?";
        try (Connection conexao = new Conexao().getConnection();
             PreparedStatement ps = conexao.prepareStatement(sql)) {
            
            ps.setString(1, nome);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("id");
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar ID do professor: " + e.getMessage());
            throw e;
        }
        return -1; // Retorna -1 se não encontrar
    }

    public boolean cadastrarProfessor(String nome, String matricula) throws SQLException {
        String sql = "INSERT INTO professor (nome, matricula) VALUES (?, ?)";
        try (Connection conexao = new Conexao().getConnection();
             PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, nome);
            ps.setString(2, matricula);
            int affectedRows = ps.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar professor: " + e.getMessage());
            throw e;
        }
    }
    
    public boolean existeProfessorPorMatricula(String matricula) throws SQLException {
        String sql = "SELECT COUNT(*) AS total FROM professor WHERE matricula = ?";
        try (Connection conexao = new Conexao().getConnection();
             PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, matricula);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("total") > 0;
                }
            }
        } catch (SQLException e) {
            System.err.println("Erro ao verificar matrícula de professor: " + e.getMessage());
            throw e;
        }
        return false;
    }

    /**
     * NOVO MÉTODO
     * Busca no banco de dados e retorna uma lista com o nome de todos os professores.
     * @return Uma lista de Strings com os nomes dos professores.
     * @throws SQLException se ocorrer um erro de banco de dados.
     */
    public List<String> listarNomesProfessores() throws SQLException {
        List<String> professores = new ArrayList<>();
        String sql = "SELECT nome FROM professor ORDER BY nome";

        try (Connection conexao = new Conexao().getConnection();
             PreparedStatement ps = conexao.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                professores.add(rs.getString("nome"));
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar nomes de professores: " + e.getMessage());
            throw e; // Lança a exceção para a camada que chamou
        }
        return professores;
    }
}
