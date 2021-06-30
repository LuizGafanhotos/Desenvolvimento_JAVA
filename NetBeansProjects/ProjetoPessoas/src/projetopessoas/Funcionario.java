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
public class Funcionario extends  Pessoa{
    private String setor;
    private boolean trabalhando;
    
    public void MudarTrabalho(){
        this.trabalhando = ! this.trabalhando;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhador() {
        return trabalhando;
    }

    public void setTrabalhador(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
}
