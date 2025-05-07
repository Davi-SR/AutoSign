package model;

//Classe Projetor herdando de sala
public class Projetor extends Sala {
    public String marca;

    //Atributos da classe pai
    public Projetor(String bloco, int numero, String marca) {
        super(bloco, numero);
        this.bloco = bloco;
        this.numero = numero;
        this.marca = marca;
    }
    
   
}
