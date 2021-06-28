package Pastaatividades6;
import java.util.ArrayList;
import java.util.Scanner;

public class at1 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        String nome = new String();
        Scanner ler = new Scanner(System.in);
        int i;
        do {
            System.out.println("Digite um nome:");
            nome = ler.nextLine();
        if(!nome.isBlank()) {
            if (!nomes.contains(nome)) {
                nomes.add(nome);
            } else
                System.out.println("Nome ja inserido");
        }
        }while (!nome.isBlank());
        for (i=0; i<nomes.size();i++){
            System.out.println("posição: "+i+" "+ nomes.get(i));
        }
    }
}
