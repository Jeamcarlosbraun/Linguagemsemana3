package Pastaatividades6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class at4 {
    public static void main(String[] args) {
        int anterior,sucessor;
        Scanner ler = new Scanner(System.in);
        String nome;
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Jeam");
        nomes.add("Lucas");
        nomes.add("Eduarda");
        nomes.add("Danielle");
        nomes.add("Pablo");
        nomes.add("Matheus");
        nomes.add("Amanda");
        nomes.add("Teresinha");
        nomes.add("Orlando");
    System.out.println("Digite um nome:");
    nome = ler.nextLine();
    if (nomes.contains(nome)){
        anterior = nomes.indexOf(nome)-1;
        sucessor = nomes.indexOf(nome)+1;
        if (anterior == -1) {
            System.out.println("Ele e o primeiro nome");
        }else{
                System.out.println("Anterior: " + nomes.get(anterior));
            }
            if (sucessor == nomes.size()) {
                System.out.println("Ele e o ultimo nome não tem vizinho");
            } else {
                System.out.println("Sucessor: " + nomes.get(sucessor));
            }
        }
    System.out.println("Todos os nomes:");
        Collections.sort(nomes);

        for (String imprimir:nomes){
            System.out.println(imprimir);
        }
    }
}
