package model;

import java.sql.Timestamp;

public class RetiradaModel {

    private int id;
    private String nomeProfessor;
    private int numeroSala;
    private String marcaMaterialAr;
    private String marcaMaterialDataShow;
    private Timestamp dataHora;
    private String nomeBloco; // Adicionado para a exibição na tabela

    // Construtor vazio (necessário para instanciar e depois setar os valores)
    public RetiradaModel() {
    }

    // Construtor completo (opcional, mas bom para testar ou criar objetos rapidamente)
    public RetiradaModel(int id, String nomeProfessor, int numeroSala, String marcaMaterialAr, String marcaMaterialDataShow, Timestamp dataHora, String nomeBloco) {
        this.id = id;
        this.nomeProfessor = nomeProfessor;
        this.numeroSala = numeroSala;
        this.marcaMaterialAr = marcaMaterialAr;
        this.marcaMaterialDataShow = marcaMaterialDataShow;
        this.dataHora = dataHora;
        this.nomeBloco = nomeBloco;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public String getMarcaMaterialAr() {
        return marcaMaterialAr;
    }

    public void setMarcaMaterialAr(String marcaMaterialAr) {
        this.marcaMaterialAr = marcaMaterialAr;
    }

    public String getMarcaMaterialDataShow() {
        return marcaMaterialDataShow;
    }

    public void setMarcaMaterialDataShow(String marcaMaterialDataShow) {
        this.marcaMaterialDataShow = marcaMaterialDataShow;
    }

    public Timestamp getDataHora() {
        return dataHora;
    }

    public void setDataHora(Timestamp dataHora) {
        this.dataHora = dataHora;
    }

    // Novo getter e setter para nomeBloco
    public String getNomeBloco() {
        return nomeBloco;
    }

    public void setNomeBloco(String nomeBloco) {
        this.nomeBloco = nomeBloco;
    }
}