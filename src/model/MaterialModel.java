package model;

public abstract class MaterialModel extends SalaModel {
    protected String marca;
    private int id;
    
    public MaterialModel(String bloco, int numero, String marca) {
        super(bloco, numero);
        this.marca = marca;
        this.numero = numero;
        this.bloco = bloco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
