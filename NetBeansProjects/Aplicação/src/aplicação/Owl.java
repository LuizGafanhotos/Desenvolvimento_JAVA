/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicação;
import java.util.Scanner;
/**
 *
 * @author renata
 */
public class Owl {
    public char sexo;
    public  String nome;
    public int idade;
    private String emprego;
    //Os Scanners
    private Scanner dados1;
    private Scanner dados2;
    private Scanner dados3;
    
    
    public void status(){
        System.out.println("Seu genero é " + this.sexo);
        System.out.println("Seu nome é " + this.nome);
        System.out.println("Sua idade é " + this.idade);
    }
    public void emprego(){
        Scanner em = new Scanner(System.in);
        System.out.println("Qual é o seu trabalho?: ");
        emprego = em.next();
        if (emprego == null){
            System.out.println("Você não escreveu seu trabalho");
            return;
        }else{
            System.out.println("Seu emprego é: "+ this.emprego);
        }
     
    }
}
