
package operadorternario;

public class OperadorTernario {

    public static void main(String[] args) {
        int n1,n2,medida;
        n1 = 14;
        n2 = 15;
        
        medida = (n1>n2)? n1+n2: n1-n2;
        System.out.println(medida);
        
        System.out.println("--------------------");
        //Diferença de string
        CoparaçãoString cs = new CoparaçãoString();
        cs.string();
        System.out.println("----------------------");
        //Diferença de operadores || && ^ e !
        cs.OperLogic();
    }
    
}
