package Exercicio3.at2;
import java.util.Scanner;
public class at2 {
    public static void main(String[] args) {
        int c, v;
        int conta = 0;
        String[] x = new String[100];
        Scanner ler = new Scanner(System.in);
        System.out.printf("Digite um numero");
        c = ler.nextInt();
        do {
            v = c % 10;
            c = c / 10;
            if (v != 0) {
                switch (v) {
                    case 1:
                        x[conta] = "um";
                        break;
                    case 2:
                        x[conta] = "dois";
                        break;
                    case 3:
                        x[conta] = "tres";
                        break;
                    case 4:
                        x[conta] = "quatro";
                        break;
                    case 5:
                        x[conta] = "cinco";
                        break;
                    case 6:
                        x[conta] = "seis";
                        break;
                    case 7:
                        x[conta] = "sete";
                        break;
                    case 8:
                        x[conta] = "oito";
                        break;
                    case 9:
                        x[conta] = "nove";
                        break;
                }
                conta++;
            }
        } while (v != 0);
        for (int i = conta - 1; i >= 0; i--) {
            System.out.print(x[i] + ", ");
        }
    }
}
