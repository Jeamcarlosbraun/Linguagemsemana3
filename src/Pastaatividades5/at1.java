package Pastaatividades5;

import java.util.Scanner;

public class at1 {
    public static void main(String[] args) {
        int i = 0;
        String numero;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu numero:");
        numero = ler.nextLine();
        numero = numero.replaceAll(" |-|", "");
        numero=numero.replace("(","");
        numero=numero.replace(")","");
        System.out.println (numero);
        if(numero.length()==11){
            System.out.println("Telefone Celular");
        }else if(numero.length()==10){
            System.out.println("Telefone Fixo");
        }else
            System.out.println("Telefone Invalido");
    }
}
