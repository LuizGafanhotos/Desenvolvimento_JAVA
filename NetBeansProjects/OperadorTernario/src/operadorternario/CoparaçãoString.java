/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadorternario;

/**
 *
 * @author renata
 */
public class CoparaçãoString {
    public void string(){
        String nome1 = "Gustavo";
        String nome2 = "Gustavo";
        String nome3 = new String("Gustavo");
        String res;
        res = (nome1==nome3)?"Igual":"Diferente";
        System.out.println(res);
    }
    public void OperLogic(){
        int x,y,z;
        x = 4;
        y = 7;
        z = 12;
        boolean f;
        f = (x<y ^ y==z)?true:false;
        System.out.println(f);
    }
}
