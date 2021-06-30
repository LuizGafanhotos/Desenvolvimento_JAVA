/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopessoas;

/**
 *
 * @author renata
 */
public class Professor extends  Pessoa {
    ///Atributos
    private String espec;
    private float salár;
    //Métodos
    
    public void ReceberAum(float aum){
        this.salár += aum;
    }

    public String getEspec() {
        return espec;
    }

    public void setEspec(String espec) {
        this.espec = espec;
    }

    public float getSalár() {
        return salár;
    }

    public void setSalár(float salár) {
        this.salár = salár;
    }
    
}
