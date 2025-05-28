package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SalaDAO {

    // Verifica se já existe sala com mesmo número no bloco informado
    public boolean existeSalaBloco(int numero, String letraBloco) {
        String sql = "SELECT COUNT(*) AS total " +
                "FROM sala s " +
                "JOIN bloco b ON s.bloco = b.id " +
                "WHERE s.numero = ? AND b.letra = ?";
        try (Connection conexao = new Conexao().getConnection();
             PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setInt(1, numero);
            ps.setString(2, letraBloco);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("total") > 0;
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro número 10: " + e.getMessage());
        }
        return false;
    }

    // Cadastra nova sala, buscando primeiro o id do bloco
    public boolean cadastrarSala(int numero, String letraBloco) {
        // 1) Busca o ID do bloco pela letra
        String sqlBuscaBloco = "SELECT id FROM bloco WHERE letra = ?";
        Integer idBloco = null;
        try (Connection conexao = new Conexao().getConnection();
             PreparedStatement psBusca = conexao.prepareStatement(sqlBuscaBloco)) {

            psBusca.setString(1, letraBloco);
            try (ResultSet rs = psBusca.executeQuery()) {
                if (rs.next()) {
                    idBloco = rs.getInt("id");
                } else {
                    // bloco não existe
                    return false;
                }
            }

        } catch (SQLException e) {
            System.out.println("Erro ao buscar bloco: " + e.getMessage());
            return false;
        }

        // 2) Insere a sala usando o id do bloco
        String sqlInsereSala = "INSERT INTO sala (numero, bloco) VALUES (?, ?)";
        try (Connection conexao = new Conexao().getConnection();
             PreparedStatement psInsert = conexao.prepareStatement(sqlInsereSala)) {

            psInsert.setInt(1, numero);
            psInsert.setInt(2, idBloco);
            int linhas = psInsert.executeUpdate();
            return linhas > 0;

        } catch (SQLException e) {
            System.out.println("Erro ao inserir sala: " + e.getMessage());
            return false;
        }
    }

    // Lista blocos existentes (letras)
    public List<String> listarBlocos() {
        List<String> blocos = new ArrayList<>();
        String sql = "SELECT DISTINCT letra FROM bloco ORDER BY letra";

        try (Connection conn = new Conexao().getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                blocos.add(rs.getString("letra").toUpperCase());
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar blocos: " + e.getMessage());
        }

        return blocos;
    }
}
