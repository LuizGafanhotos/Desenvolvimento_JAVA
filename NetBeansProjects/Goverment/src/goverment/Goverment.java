/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package goverment;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
public class Goverment {

    public static void main(String[] args) {
        //O frame
        int q = 0;
        JFrame framo = new JFrame("Exemplo exemplar"); 
        boolean verdade = true;
        while (verdade == true){
            String n1;
            String n2;
            n1 = JOptionPane.showInputDialog(null, "Digite um numero");
            int num1 = Integer.parseInt(n1);
            n2 = JOptionPane.showInputDialog(null, "Digite outro valor");
            int num2 = Integer.parseInt(n2);
            //Calculo e a mostra do calculo
            int r = num1 * num2;

            JOptionPane.showMessageDialog(null,"O resultado entre  " + num1 + " e " + num2 + " é igual a " + r);
            int esco = JOptionPane.showConfirmDialog(framo, "Você gostaria de ir denovo? ", "sim ou não?", JOptionPane.YES_NO_OPTION);

            if (esco == JOptionPane.YES_OPTION){
                continue;
            }else{
                if (esco == JOptionPane.NO_OPTION){
                    verdade = false;
                    break;
                } 
            }
        }
        
    }
}
