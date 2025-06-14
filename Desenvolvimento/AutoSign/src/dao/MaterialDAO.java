package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MaterialDAO {

    //Metodo para registrar Material no MySQL
    public boolean registrarMaterial(int idSala, String marcaArCondicionado, String marcaDataShow) {
        String sql = "INSERT INTO sala_material (id_sala, id_material) VALUES (?, ?)";

        try (Connection conexao = new Conexao().getConnection()) {
            // Ar Condicionado
            int idMaterialAr = buscarIdMaterial("Ar Condicionado", marcaArCondicionado);
            if (idMaterialAr == -1) return false;

            try (PreparedStatement ps = conexao.prepareStatement(sql)) {
                ps.setInt(1, idSala);
                ps.setInt(2, idMaterialAr);
                ps.executeUpdate();
            }

            // DataShow
            int idMaterialDs = buscarIdMaterial("DataShow", marcaDataShow);
            if (idMaterialDs == -1) return false;

            try (PreparedStatement ps = conexao.prepareStatement(sql)) {
                ps.setInt(1, idSala);
                ps.setInt(2, idMaterialDs);
                ps.executeUpdate();
            }

            return true;

        } catch (SQLException e) {
            System.out.println("Erro ao registrar material: " + e.getMessage());
            return false;
        }
    }

    //Metodo para conectar o Material de Acordo com o ID
    public int buscarIdMaterial(String tipo, String marca) {
        String sql = "SELECT id FROM material WHERE tipo = ? AND marca = ?";
        try (Connection conexao = new Conexao().getConnection();
             PreparedStatement ps = conexao.prepareStatement(sql)) {
            ps.setString(1, tipo);
            ps.setString(2, marca);
            var rs = ps.executeQuery();
            if (rs.next()) {
                return rs.getInt("id");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao buscar id do material: " + e.getMessage());
        }
        return -1;
    }
    
    
    public List<String> listarMarcasPorTipo(String tipo) {
    List<String> marcas = new ArrayList<>();
    String sql = "SELECT DISTINCT marca FROM material WHERE tipo = ?";
    try (Connection conexao = new Conexao().getConnection();
         PreparedStatement ps = conexao.prepareStatement(sql)) {
        
        ps.setString(1, tipo);
        try (ResultSet rs = ps.executeQuery()) {  // ← Aqui usamos o try com ResultSet
            while (rs.next()) {
                marcas.add(rs.getString("marca"));
            }
        }
    } catch (SQLException e) {
        System.out.println("Erro ao listar marcas: " + e.getMessage());
    }
    return marcas;
}
public int buscarIdPorMarca(String marca) {
    String sql = "SELECT id FROM material WHERE marca = ? AND tipo = 'DataShow'";
    try (Connection conn = new Conexao().getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {

        stmt.setString(1, marca);
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                return rs.getInt("id");
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
    }
    return -1;
}
}

    
