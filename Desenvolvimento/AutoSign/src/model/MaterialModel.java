package model;

public class MaterialModel {

    private int id;
    private String tipo;
    private String marca; 

    // Construtor
    public MaterialModel(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
