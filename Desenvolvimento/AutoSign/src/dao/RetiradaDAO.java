package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.RetiradaModel; // Certifique-se de que este model existe e está correto

public class RetiradaDAO {

    /**
     * Registra uma retirada completa no banco de dados.
     * @param idProfessor O ID do professor.
     * @param idSala O ID da sala.
     * @param idMaterialAr O ID do material 'Ar Condicionado'.
     * @param idMaterialDataShow O ID do material 'DataShow'.
     * @return true se a operação for bem-sucedida, false caso contrário.
     * @throws SQLException se ocorrer um erro de banco de dados.
     */
    public boolean registrarRetiradaCompleta(int idProfessor, int idSala, int idMaterialAr, int idMaterialDataShow) throws SQLException {
        String sql = "INSERT INTO retirada (id_professor, id_sala, id_material_ar, id_material_datashow, data_hora) VALUES (?, ?, ?, ?, NOW())";

        try (Connection conexao = new Conexao().getConnection();
             PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setInt(1, idProfessor);
            ps.setInt(2, idSala);
            ps.setInt(3, idMaterialAr);
            ps.setInt(4, idMaterialDataShow);

            int affectedRows = ps.executeUpdate();
            return affectedRows > 0;

        } catch (SQLException e) {
            System.err.println("Erro ao registrar retirada completa: " + e.getMessage());
            throw e;
        }
    }

    /**
     * Lista todas as retiradas com detalhes de professor, sala, bloco e materiais.
     * @return Uma lista de objetos RetiradaModel contendo as informações detalhadas das retiradas.
     * @throws SQLException se ocorrer um erro de banco de dados.
     */
    public List<RetiradaModel> listarRetiradasComDetalhes() throws SQLException {
        List<RetiradaModel> retiradas = new ArrayList<>();
        // SQL atualizado para incluir o nome do bloco e assumir que data_devolucao IS NULL para pendentes
        String sql = "SELECT r.id, p.nome AS professor_nome, s.numero AS sala_numero, b.bloco AS bloco_nome, " +
                     "mar.marca AS ar_condicionado_marca, mds.marca AS datashow_marca, r.data_hora, r.data_devolucao " +
                     "FROM retirada r " +
                     "JOIN professor p ON r.id_professor = p.id " +
                     "JOIN sala s ON r.id_sala = s.id " +
                     "JOIN bloco b ON s.id_bloco = b.id " + // JOIN com a tabela de bloco
                     "JOIN material mar ON r.id_material_ar = mar.id " +
                     "JOIN material mds ON r.id_material_datashow = mds.id " +
                     "WHERE r.data_devolucao IS NULL ORDER BY r.data_hora DESC"; // Filtra apenas as retiradas não devolvidas

        try (Connection conexao = new Conexao().getConnection();
             PreparedStatement ps = conexao.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                RetiradaModel retirada = new RetiradaModel();
                retirada.setId(rs.getInt("id"));
                retirada.setNomeProfessor(rs.getString("professor_nome"));
                retirada.setNumeroSala(rs.getInt("sala_numero"));
                retirada.setNomeBloco(rs.getString("bloco_nome")); // Setar o nome do bloco
                retirada.setMarcaMaterialAr(rs.getString("ar_condicionado_marca"));
                retirada.setMarcaMaterialDataShow(rs.getString("datashow_marca"));
                retirada.setDataHora(rs.getTimestamp("data_hora"));
                retiradas.add(retirada);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar retiradas com detalhes: " + e.getMessage());
            throw e;
        }
        return retiradas;
    }

    /**
     * Atualiza o status de uma retirada registrando a data de devolução.
     * Assume que a tabela 'retirada' tem uma coluna 'data_devolucao' do tipo TIMESTAMP NULL.
     * @param idRetirada O ID da retirada a ser atualizada.
     * @return true se a operação for bem-sucedida, false caso contrário.
     * @throws SQLException se ocorrer um erro de banco de dados.
     */
    public boolean atualizarStatusRetirada(int idRetirada) throws SQLException {
        String sql = "UPDATE retirada SET data_devolucao = NOW() WHERE id = ?";

        try (Connection conexao = new Conexao().getConnection();
             PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setInt(1, idRetirada);

            int affectedRows = ps.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar status da retirada: " + e.getMessage());
            throw e;
        }
    }
}