
package objetojava;

public class Classe {
    String modelo;
    String cor;
    float ponta;
    boolean tampada;
    int carga;
    
    void rabiscar(){
        if (tampada == true){
            System.out.println("Erro, eu não posso rabiscar");
        }else{
            System.out.println("Rabiscando");
        }
        
    }
    void tampar(){
        this.tampada = true;
    }
    void destampar(){
        this.tampada = false;   
    }
    void status(){
        System.out.println("Cor da caneta: " + this.cor);
        System.out.println("A ponta da caneta:  " + this.ponta);
        System.out.println("esta tampada?:  " + this.tampada);
        System.out.println("O modelo da caneta: " + this.modelo);
        System.out.println("A carga: " + this.carga);
    }
}
