package Pastaatividades2;

public class at5 {
    public static void main(String[] args) {
        int loteria[] = {6, 11, 14, 22, 24, 60};
        int ganhador = 0;
        int acertos = 0;
        int x, j, c, compara = 0;
        int apostas[][] = {
                {100, 3, 11, 24, 50, 58, 59},
                {200, 1, 6, 12, 13, 55, 60},
                {300, 1, 2, 3, 4, 5, 6},
                {400, 5, 45, 47, 56, 57, 58},
                {500, 6, 11, 22, 24, 24, 44}
        };
        for (x = 0; x < 5; x++) {
            System.out.println("Apostador numero " + apostas[x][0]);
            for (j = 1; j < 7; j++) {
                int sorteado = 0;
                compara = apostas[x][j];
                for (c = 0; c < 5; c++) {
                    if (compara == loteria[c]) {
                        sorteado = 1;
                        break;
                    }
                }if (sorteado == 1) {
                    apostas[x][7]++;
                }
            }
            System.out.println("Teve " + apostas[x][7] + " acertos");
        }
        for (x = 0; x < 5; x++) {
            if (apostas[x][7] > acertos) {
                acertos = apostas[x][7];
                ganhador = apostas[x][0];
            }
        }
        System.out.println("O ganhador foi o Apostador numero " + ganhador + " com " + acertos + "acertos");
    }
}
