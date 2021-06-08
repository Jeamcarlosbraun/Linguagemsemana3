package Exerciciosemana2;

import java.util.Scanner;

public class at7 {
    public static void main(String[] args) {
        Scanner ler=new Scanner(System.in);
        int v[] = {1,2,3,4,5,6,7,8,9,10};
        int numero=0,j=0,c=0;
        System.out.println("Digite um numero");
        numero = ler.nextInt();
        for(j=0;j<10;j++) {
            if (numero == v[j]) {
                System.out.println("Este numero esta na posicao " + j);
                c++;
                break;
            }
            // else{
            //System.out.println("O numero fornecido nao existe no vetor!");
        }
        if(c==0){
            System.out.println("O numero fornecido nao existe no vetor!");
        }
        ler.close();
    }
}
