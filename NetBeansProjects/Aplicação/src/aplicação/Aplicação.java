/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicação;

/**
 *
 * @author renata
 */
public class Aplicação {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Owl o = new Owl();
        Owl o2 = new Owl();
        //Menino
        System.out.println("-----------------------------------------------");
        o.nome = "Daniel";
        o.sexo = 'M';
        o.idade = 13;
        o.status();
        System.out.println("-----------------------------------------------");
        //Menina
        o2.nome = "Mariana";
        o2.sexo = 'F';
        o2.idade = 18;
        o2.emprego();
        o2.status();
        System.out.println("-----------------------------------------------");
        
    }
    
}
