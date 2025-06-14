package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
public class BlocoDAO {
    public List<String> listarBlocos() throws Exception {
        List<String> blocos = new ArrayList<>();
        String sql = "SELECT DISTINCT bloco FROM bloco";
        try (Connection conexao = new Conexao().getConnection();
             PreparedStatement stmt = conexao.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                blocos.add(rs.getString("bloco"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Erro ao buscar blocos: " + e.getMessage());
        }
        return blocos;
    }
}