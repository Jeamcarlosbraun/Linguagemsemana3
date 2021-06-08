package Exerciciosemana2;

public class at1 {
    public static void main(String[] args) {
        int vetor[] = {1, 2, 3, 4, 5, 8, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int par = 0, x;
        int y;
        for (x = 0; x < 20; x++) {
            System.out.println(vetor[x] + " na posicao " + x);
            if (vetor[x] % 2 == 0) {

                par++;
            }
        }
        System.out.println("Existem " + par + " numeros pares no Vetor");
    }
}
