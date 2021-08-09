package Pastaatividades9.at2;

public class Execucao3 {
    public static void main(String[] args) {
        Paisa p1 = new Paisa("BRA", "BRASIL", 2000.1, 102);
        Paisa p2 = new Paisa("ARG", "ARGENTINA", 212.1, 103);
        Paisa p3 = new Paisa("URU", "URUGUAI", 2034.1, 105);
        Paisa p4 = new Paisa("EQU", "EQUADOR", 2230.1, 106);
        Paisa p5 = new Paisa("BOL", "BOLIVIA", 2561.3, 107);


    Continente america = new Continente("America");
    america.adiciona(p1);
    america.adiciona(p2);
    america.adiciona(p3);
    america.adiciona(p4);
    america.adiciona(p5);
    }
}
