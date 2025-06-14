package model;

public abstract class SalaModel {
    
    private int id;
    protected String bloco;
    protected int numero;
        
    //Construtor com Bloco e Numero da Sala
    public SalaModel(String bloco, int numero){
        this.bloco = bloco;
        this.numero = numero;     
    }
    
    //Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBloco() {
        return bloco;
    }

    public void setBloco(String bloco) {
        this.bloco = bloco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}