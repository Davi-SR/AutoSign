package autosign; 

import view.LoginView;

// Responsável por iniciar o sistema
public class Main {
    public static void main(String[] args) {
        LoginView tela = new LoginView(); 
        tela.setLocationRelativeTo(null); 
        tela.setVisible(true); 
    }
}