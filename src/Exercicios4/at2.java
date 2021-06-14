package Exercicios4;

import java.util.Scanner;

public class at2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        StringBuilder inverte = new StringBuilder();
        String frase;
        String[] j = new String[100];
        System.out.println("Digite uma frase");
        frase = ler.nextLine();
        String[] inverter = frase.split(" ");
        for (int i = inverter.length - 1; i >= 0; i--) {
            inverte.append(inverter[i]).append(' ');
            frase += inverter[i] + ' ';
        }
        System.out.println("Invertido: " + inverte.toString());
    }
}
