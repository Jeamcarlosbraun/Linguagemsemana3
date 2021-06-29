package Pastaatividades6;

import java.util.ArrayList;
import java.util.Scanner;

public class at3 {
    public static void main(String[] args) {
        int i;
        Scanner ler = new Scanner(System.in);
        String removenome;
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
        for (String imprime : nomes){
            System.out.println(imprime);
        }
        System.out.println("qual nome deseja remover da lista:");
        removenome = ler.nextLine();
        if (removenome.equals("clear")){
            nomes.clear();
                }
        else
            if (nomes.contains(removenome)) {
                System.out.println(removenome + " removido");
                nomes.remove(removenome);
            }else{
                    System.out.println("Nome não encontrado");
        }
        for (String imprime : nomes){
            System.out.println(imprime);
        }
        System.out.println("Lista nomes:");
        for (String novalista : nomes){
            System.out.println(novalista);
        }
    }
}
