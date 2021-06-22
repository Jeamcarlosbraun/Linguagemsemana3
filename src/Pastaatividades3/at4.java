package Pastaatividades3;

import java.util.Scanner;

public class at4 {
    public static void main(String[] args) {
        String nome;
        Scanner ler;
        ler = new Scanner(System.in);
        System.out.printf("Digite o texto:\n");
        nome=ler.nextLine();
        String[]frase = nome.split(" ");
        System.out.printf("%d caracteres e ",nome.length());
        System.out.printf(frase.length+" palavras");

    }
}
