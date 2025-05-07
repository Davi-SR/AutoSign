
package model;

//Herança da classe AbstractSala
public class Sala extends AbstractSala {
    
    protected int numero;
    protected String bloco;

    //Atributos da classe pai
    public Sala(String bloco, int numero) {
        super(bloco, numero);
    }
    
    public void Sala (int numero, String bloco){
        this.bloco = bloco;
        this.numero = numero;
        
    }
    
  }
