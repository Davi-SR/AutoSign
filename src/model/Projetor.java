/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


public class Projetor extends Sala {
    public String marca;

    public Projetor(String bloco, int numero, String marca) {
        super(bloco, numero);
        this.bloco = bloco;
        this.numero = numero;
        this.marca = marca;
    }
    
   
}
