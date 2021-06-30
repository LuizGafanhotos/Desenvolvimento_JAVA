/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiencia;

/**
 *
 * @author renata
 */
public class Experiencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] num = {4,65,3,2,1,7,8,16};//Vetores que pode mudar
        int[] demon = {2,0,4,8,0};//Vetores que pode mudar
        
        for(int i=2; i<num.length; i++){//O valor pode ser mudado, a variavel 'i'
            try{
                if (num[i] % 2 != 0){
                    System.out.println(num[i] + " / " + demon[i] + " = " + (num[i]/demon[i]));
                }
            }catch (Exception e){
                System.out.println("Aconteceu um erro");
            }
        }
    }
    
}
