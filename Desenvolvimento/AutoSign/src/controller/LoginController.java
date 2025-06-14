package controller;

import dao.Conexao;
import dao.LoginDAO;
import view.CadastroView;
import java.sql.Connection;
import java.sql.SQLException;
import view.LoginView;


public class LoginController {
    
    // Método para cadastrar um novo usuário, recebendo os dados da interface gráfica (CadastroView)
    public void cadastroUsuario(CadastroView view)throws SQLException{
        Connection conexao = new Conexao().getConnection();
        LoginDAO cadastro = new LoginDAO();
        cadastro.cadastrarUsuario(view.getjTextFieldNome().getText(), view.getjTextFieldEmail().getText(), view.getjPasswordFieldSenha().getText());
    }
    
    //Método para logar o usuário cadastrado com os dados inseridos no banco de dados
    public void loginUsuario(LoginView view)throws SQLException{
        Connection conexao = new Conexao().getConnection();
        LoginDAO login = new LoginDAO();
        login.login(view.getjTextFieldLogin().getText(), view.getjPasswordFieldSenha().getText());
    }
    
}