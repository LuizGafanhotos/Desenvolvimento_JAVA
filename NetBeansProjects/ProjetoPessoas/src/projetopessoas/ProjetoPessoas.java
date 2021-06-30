
package projetopessoas;


public class ProjetoPessoas {

    
    public static void main(String[] args) {
        // all code application logic here
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Zé droguinha");
        p2.setNome("Daniela da silva");
        p3.setNome("Gustavo Guanabara");
        p4.setNome("Tallison");
        //Seus genero
        p1.setSexo('M');
        p2.setSexo('F');
        p3.setSexo('M');
        p4.setSexo('M');
        //Idade
        p1.setIdade(12);
        p2.setIdade(41);
        p3.setIdade(32);
        p4.setIdade(18);
        //Base pra tudo
        System.out.println("Dados de pessoas");
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
    
}
