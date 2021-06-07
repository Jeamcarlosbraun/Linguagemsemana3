package Exercicio3.at1;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        int vogais=0,digitos=0;
        String digite;
        Scanner ler;
        ler = new Scanner(System.in);
        System.out.println("Digite alguma coisa");
        digite = ler.nextLine();
        //a
        System.out.println("a) "+digite.length()+ " caracteres");
        //b
        System.out.println("b) "+ digite.toUpperCase());
        //c
        digite.toLowerCase();
        for (int i = 0; i < digite.length(); i++){
            char c = digite.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                vogais++;
        }
        System.out.println("c) tem "+vogais+ " vogais");
        //d
        digite.toLowerCase();
        if (digite.startsWith("uni")) {
            System.out.println("d) Comeca com UNI");
        }else{
                System.out.println("d) Nao comeca com UNI");
            }
        //e
        if (digite.endsWith("rio")){
            System.out.println("e) Termina com RIO");
        }else{
            System.out.println("e) Nao termina com RIO");
        }
        //f
        for (int i=0; i< digite.length();i++){
            if(Character.isDigit(digite.charAt(i))){
                digitos++;
            }
        }
        System.out.println("f) tem "+digitos+ " digitos");
        StringBuilder nova = new StringBuilder();

        for( int i=digite.length()-1;i>=0;i--){
            nova.append(digite.charAt(i));
        }
        if (digite.equals(nova) ){
            System.out.println("g) E um palindromo");
        }else{
            System.out.println("g) Nao e um palindromo");
        }
    }
}
