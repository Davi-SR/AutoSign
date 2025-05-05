package controller;

import dao.Conexao;
import dao.loginDAO;
import view.CadastroView;
import java.sql.Connection;
import java.sql.SQLException;



public class LoginController {
    
    public void cadastroUsuario(CadastroView view) throws SQLException{
    
        Connection conexao = new Conexao().getConnection();
        loginDAO cadastro = new loginDAO();
        cadastro.cadastrarUsuario(view.getjTextFieldUser().getText(), view.getjTextFieldEmail().getText(), view.getjPasswordFieldSenha().getText());
    }    
}
