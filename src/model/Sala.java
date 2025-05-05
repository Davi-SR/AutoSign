/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Davi Ramos
 */
public class Sala extends AbstractSala {
    
    protected int numero;
    protected String bloco;

    public Sala(String bloco, int numero) {
        super(bloco, numero);
    }
    
    public void Sala (int numero, String bloco){
        this.bloco = bloco;
        this.numero = numero;
        
    }
    
  }
