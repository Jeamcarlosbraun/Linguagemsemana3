package Exercicio3.at3;
import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        int i = 0;
        String nome;
        Scanner ler;
        ler = new Scanner(System.in);
        System.out.print("Nome:\n ");
        nome = ler.nextLine().toUpperCase();
        System.out.printf(nome + "\n");
        System.out.print(nome.charAt(0));
        for (i = 0; i < nome.length(); i++) {
            if (nome.charAt(i) == ' ') {
                nome = nome.replaceAll("da|das|do|dos", "");
                System.out.print(nome.charAt(i + 1));
            }
        }













    }
}

