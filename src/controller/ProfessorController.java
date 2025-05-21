package controller;

import dao.Conexao;
import dao.ProfessorDAO;
import java.sql.Connection;
import java.sql.SQLException;
import view.CadastroProfessorView;

public class ProfessorController {

    //metodo para preencher as informações do professor no MySQL
    public void cadastrarProfessor(CadastroProfessorView view) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        ProfessorDAO dao = new ProfessorDAO();
        dao.cadastrarProfessor(view.getjTextFieldNome().getText(), view.getjTextFieldMatricula().getText());
    }
}