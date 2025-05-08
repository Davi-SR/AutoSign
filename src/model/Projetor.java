package model;

//Subclasse Projetor herdando de sala

/**
 *
 * @author Davi Ramos
 */
public class Projetor extends AbstractSala {
    private String marca;

    //Atributos da classe pai
    public Projetor(String bloco, int numero, String marca) {
        super(bloco, numero);
        this.bloco = bloco;
        this.numero = numero;
           }
    
    // Encapsulamento da marca
    public void setmarca(String marca){
        this.marca = marca;
    }
    
    public String getmarca(){
        return marca;
    }
    
   
}
