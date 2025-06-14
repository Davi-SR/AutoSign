package model;

public class ProfessorModel {
    
    private int id;
    private String nome;
    private String matricula;

    //Construtor para cadastro de professor
    public ProfessorModel(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    //Construtor vazio
    public ProfessorModel() {
    }

    //Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
}