package model;

//Classe pai abstrata para modelo 
public abstract class AbstractSala {
    protected String bloco;
    protected int numero;

    //Atributos
    public AbstractSala(String bloco, int numero) {
        this.bloco = bloco;
        this.numero = numero;
    }

    //Encapsulamento
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