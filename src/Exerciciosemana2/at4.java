package Exerciciosemana2;

public class at4 {
    public static void  main(String[] args){
        int vetor1[] = {3, 14, 21, 54, 65, 34, 21, 23, 5, 1};
        int menorvalor = vetor1[0];
        int valorfinal = 0;
        int posicao = 0;
        int x;
        for(x=0;x<10;x++){
            System.out.println(vetor1[x]+" Posicao "+ x);
        }for(x=0;x<10;x++){
            if(menorvalor > vetor1[x]){
                valorfinal = vetor1[x];
                menorvalor=valorfinal;
                posicao = x;
            }
        }
        System.out.println (valorfinal+ " E o menor valor na posicao "+ posicao);

    }
}
