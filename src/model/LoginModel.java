package model;


public class LoginModel {
    
    private String user,email,senha;
    
    //Inicio Construtor
    public LoginModel(String user, String senha) {
        this.user = user;
        this.senha = senha;
    }
    
    public LoginModel( String user, String email, String senha){
        this.user = user;
        this.email = email;
        this.senha = senha;
    }
    //Fim Construtor
    
    //Encapsulamento
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
