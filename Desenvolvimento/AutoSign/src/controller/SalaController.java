package controller;

import dao.Conexao;
import dao.SalaDAO;
import java.sql.Connection;
import java.sql.SQLException;
import view.SalaView;

public class SalaController {
    
    public void cadastrarSala(SalaView view) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        SalaDAO dao = new SalaDAO();
        dao.cadastrarSala(Integer.parseInt(view.getjTextFieldSala().getText()), view.getjComboBoxBloco().getSelectedItem().toString());
    }  
}
