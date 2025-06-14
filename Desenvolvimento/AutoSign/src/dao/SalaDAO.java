package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SalaDAO {

    // Verifica se uma sala com o mesmo número já existe no bloco informado
    public boolean existeSalaBloco(int numero, String nomeBloco) {
        String sql ="SELECT COUNT(*) AS total " + "  FROM sala s " + "  JOIN bloco b ON s.id_bloco = b.id " + " WHERE s.numero = ? " + "   AND b.bloco = ?";
        try (
            Connection conexao = new Conexao().getConnection();
            PreparedStatement ps = conexao.prepareStatement(sql)
        ) {
            ps.setInt(1, numero);
            ps.setString(2, nomeBloco);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("total") > 0;
                }
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao verificar sala no bloco: " + e.getMessage());
            return false;
        }
    }

    // Cadastra uma nova sala vinculada ao ID de um bloco
    public boolean cadastrarSala(int numero, String nomeBloco) {
        Integer idBloco = buscarIdBloco(nomeBloco);
        if (idBloco == null) {
            System.out.println("Bloco '" + nomeBloco + "' não encontrado.");
            return false;
        }
        String sql = "INSERT INTO sala (numero, id_bloco) VALUES (?, ?)";
        try (
            Connection conexao = new Conexao().getConnection();
            PreparedStatement ps = conexao.prepareStatement(sql)
        ) {
            ps.setInt(1, numero);
            ps.setInt(2, idBloco);
            ps.executeUpdate();
            return true;
        } catch (SQLException e) {
            System.out.println("Erro ao cadastrar sala: " + e.getMessage());
            return false;
        }
    }

    // Busca o ID do bloco pelo nome (letra/nome)
    private Integer buscarIdBloco(String nomeBloco) {
        String sql = "SELECT id FROM bloco WHERE bloco = ?";
        try (
            Connection conexao = new Conexao().getConnection();
            PreparedStatement ps = conexao.prepareStatement(sql)
        ) {
            ps.setString(1, nomeBloco);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt("id");
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar ID do bloco: " + e.getMessage());
        }
        return null;
    }

    // Retorna uma lista com os nomes de todos os blocos cadastrados
    public List<String> listarBlocos() {
        List<String> blocos = new ArrayList<>();
        String sql = "SELECT DISTINCT bloco FROM bloco ORDER BY bloco";
        try (
            Connection conexao = new Conexao().getConnection();
            PreparedStatement ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()
        ) {
            while (rs.next()) {
                blocos.add(rs.getString("bloco").toUpperCase());
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar blocos: " + e.getMessage());
        }
        return blocos;
    }

    // Retorna uma lista com os números de salas cadastradas no bloco informado
    public List<Integer> listarSalasPorBloco(String nomeBloco) {
        List<Integer> salas = new ArrayList<>();
        String sql =
            "SELECT s.numero " +
            "  FROM sala s " +
            "  JOIN bloco b ON s.id_bloco = b.id " +
            " WHERE b.bloco = ? " +
            " ORDER BY s.numero";
        try (
            Connection conexao = new Conexao().getConnection();
            PreparedStatement ps = conexao.prepareStatement(sql)
        ) {
            ps.setString(1, nomeBloco);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    salas.add(rs.getInt("numero"));
                }
            }
        } catch (SQLException e) {
            System.out.println("Erro ao listar salas por bloco: " + e.getMessage());
        }
        return salas;
    }
    
    //Busca o ID da Sala pelo Numero
    public int buscarIdSala(String bloco, int numero) {
        
        String sql = "SELECT s.id FROM sala s JOIN bloco b ON s.id_bloco = b.id WHERE b.bloco = ? AND s.numero = ?";
        try (Connection conexao = new Conexao().getConnection();
           PreparedStatement ps = conexao.prepareStatement(sql)) {
           ps.setString(1, bloco);
           ps.setInt(2, numero);
            var rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("id");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar id da sala: " + e.getMessage());
        }
        return -1;
    }
}