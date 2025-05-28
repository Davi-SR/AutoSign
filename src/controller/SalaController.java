package controller;

import dao.Conexao;
import dao.SalaDAO;
import java.sql.Connection;
import java.sql.SQLException;
import view.CadastroSalaView;

public class SalaController {

    // metodo para preencher as informações da Sala no MySQL
    public void cadastrarSala(CadastroSalaView view) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        SalaDAO dao = new SalaDAO();
        dao.cadastrarSala(
            Integer.parseInt(view.getjTextFieldSala().getText()), 
            view.getjComboBoxBloco().getSelectedItem().toString()
        );
    }
}
