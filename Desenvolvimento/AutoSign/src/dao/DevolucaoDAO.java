package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDateTime; // Ou java.util.Date / java.sql.Timestamp

public class DevolucaoDAO {

    /**
     * Registra a devolução de uma retirada no banco de dados.
     * Atualiza a coluna 'data_devolucao' da tabela 'retirada' para a data/hora atual.
     *
     * @param idRetirada O ID da retirada a ser devolvida.
     * @return true se a devolução foi registrada com sucesso, false caso contrário.
     * @throws SQLException se ocorrer um erro de banco de dados.
     */
    public boolean registrarDevolucao(int idRetirada) throws SQLException {
        // SQL para atualizar a coluna data_devolucao na tabela 'retirada'
        // NOW() é uma função SQL que retorna a data e hora atual do servidor de banco de dados.
        String sql = "UPDATE retirada SET data_devolucao = NOW() WHERE id = ?";

        try (Connection conexao = new Conexao().getConnection();
             PreparedStatement ps = conexao.prepareStatement(sql)) {

            ps.setInt(1, idRetirada);

            int affectedRows = ps.executeUpdate();
            return affectedRows > 0; // Retorna true se pelo menos uma linha foi atualizada
        } catch (SQLException e) {
            System.err.println("Erro ao registrar devolução para retirada ID " + idRetirada + ": " + e.getMessage());
            throw e; // Relança a exceção para que a camada de visualização possa lidar com ela
        }
    }
}