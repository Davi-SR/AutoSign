package dao;

import java.sql.*;
import java.util.*;

public class BlocoDAO {

    public List<String> listarBlocos() throws SQLException {
        List<String> blocos = new ArrayList<>();
        Connection conexao = new Conexao().getConnection();

        String sql = "SELECT DISTINCT letra FROM bloco"; // Ajuste conforme o nome real da sua tabela/coluna
        PreparedStatement stmt = conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {
            blocos.add(rs.getString("letra"));
        }

        rs.close();
        stmt.close();
        conexao.close();

        return blocos;
    }
}
