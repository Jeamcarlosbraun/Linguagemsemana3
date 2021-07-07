package Pastaatividades7;

import java.util.ArrayList;
import java.util.Scanner;

public class at2 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> salva = new ArrayList<Integer>();
        Integer numeros = 0;
        for (int i =0 ;i<10;i++){
            System.out.println("Digite o "+(i+1)+" número:");
            numeros = ler.nextInt();
            salva.add(numeros);
        }
        System.out.println("Todos os elemntos:");
        for (int i=0 ;i<salva.size();i++){
            System.out.println(salva.get(i));
        }
        for (int c=0 ;c<salva.size();c++) {
            if (salva.get(c) % 2 == 0) {
                salva.remove(c);
            }
        }
            System.out.println("Todos os elemntos impares:");
        for (int i = 0; i < salva.size(); i++) {
                System.out.println(salva.get(i));
            }
    }
}
