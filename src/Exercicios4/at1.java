package Exercicios4;

import java.util.Scanner;

public class at1 {
    public static void main(String[] args) {
        String frase = new String();
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite uma frase");
        frase = ler.nextLine();
        String[] nome = frase.split(" ");
        for (int i = nome.length - 1; i >= 0; i--) {
            System.out.print(nome[i]);
            System.out.print(" ");
        }
    }
}
