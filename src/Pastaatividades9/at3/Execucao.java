package Pastaatividades9.at3;

public class Execucao {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Armelita",null, null);
        Pessoa p2 = new Pessoa("Heitor",null, null);
        Pessoa p3 = new Pessoa("Vilmar",p1, p2);
        Pessoa p4 = new Pessoa("Teresinha",null, null);
        Pessoa p5 = new Pessoa("Jeam",p3, p4);
        Pessoa p6 = new Pessoa("Junior",p3, p4);
        Pessoa p7 = new Pessoa("Jessica",p3, p4);
    System.out.println("Jeam, é irmão de Jessica "+ p5.eirmao(p7));
    }
}
