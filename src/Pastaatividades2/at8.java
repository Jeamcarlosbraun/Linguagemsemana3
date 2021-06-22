package Pastaatividades2;

public class at8 {
    public static void main(String[] args) {
        int x[]={1,2,3,4,5,6,7,8,9,10,11,12,13,18,15};
        int maior, v, j, b,c;
        v = -1;
        do {
            v++;
            maior = v;
            for (j = v + 1; j < 15; j++) {
                if (x[j] > x[maior]) {
                    maior = j;
                }
            }
            c = x[v];
            x[v] = x[maior];
            x[maior] = c;
        } while (v < 15);
        System.out.println(" Vetor: ");
        for (b = 0; b < 15; b++) {
            System.out.println(x[b] + "[" + b + "]");
        }
    }
}
