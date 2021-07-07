package Pastaatividades7;

import java.util.ArrayList;
import java.util.Scanner;

public class at1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        ArrayList<Integer> salva = new ArrayList<Integer>();
        Integer numeros = 0;
        while (numeros > -1){
            System.out.println("Digite os numeros:");
            numeros = ler.nextInt();
            if (numeros < 0){

            }else
            salva.add(numeros);
        }
        System.out.println("Imprimindo com For:");
        for (int i=0 ;i<salva.size();i++){
        System.out.println(salva.get(i));
        }
        System.out.println("Imprimindo com For each:");
        for (Integer s: salva){
            System.out.println(s);
        }
        Integer fim = 0;
        fim = salva.size();
        int i = 0;
        System.out.println("Imprimindo com While:");
        while(i < fim ){
            System.out.println(salva.get(i));
            i++;
        }
    }

}
