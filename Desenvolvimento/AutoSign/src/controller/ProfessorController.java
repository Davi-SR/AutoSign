package controller;

import dao.Conexao;
import dao.ProfessorDAO;
import java.sql.Connection;
import java.sql.SQLException;
import view.ProfessorView;

public class ProfessorController {

    //metodo para preencher as informações do professor no MySQL
    public void cadastrarProfessor(ProfessorView view) throws SQLException {
        Connection conexao = new Conexao().getConnection();
        ProfessorDAO dao = new ProfessorDAO();
        dao.cadastrarProfessor(view.getjTextFieldProfessor().getText(), view.getjTextFieldMatricula().getText());
    }
}