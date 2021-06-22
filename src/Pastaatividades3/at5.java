package Pastaatividades3;

import java.util.Scanner;

public class at5 {
    public static void main(String[] args) {
        String texto;
        Scanner ler;
        ler = new Scanner(System.in);
        System.out.println("Digite o texto:");
        texto=ler.nextLine();
        texto = texto.replaceAll("\s+"," ");
        System.out.println(texto);
    }
}
