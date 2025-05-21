package model;

public class SalaModel {
    
    private int id;
    private String bloco;
    private int numero;
    
    
    //Construtor 
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
