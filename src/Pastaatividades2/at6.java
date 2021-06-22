package Pastaatividades2;

public class at6 {
    public static void main(String[] args) {
        int x[] ={1, 2, 3, 4, 5, 6, 7, 8, 9, 10} ;
        int y[] ={1, 5, 3, 11, 7, 12, 3, 9, 15, 16} ;
        int[] p= new int[10];
        int j, c, esta = 0;
        //a
        System.out.println("Uniao");
        for (j = 0; j < 10; j++) {
            System.out.println(x[j]);
        }
        for (j = 0; j < 10; j++) {
            System.out.println(y[j]);
        }
        //b
        System.out.println("Diferenca");
        for (j = 0; j < 10; j++) {
            p[j] = x[j] - y[j];
            System.out.println(p[j]+" ["+j+"]");
        }
        //c
        System.out.println("Soma");
        for (j = 0; j < 10; j++) {
            p[j] = x[j] + y[j];
        }
        for (j = 0; j < 10; j++) {
            System.out.println(p[j]+"["+j+"]");
        }
        //d
        System.out.println("Produto");
        for (j = 0; j < 10; j++) {
            p[j] = x[j] * y[j];
        }
        for (j = 0; j < 10; j++) {
            System.out.println (p[j]+"["+j+"]");
        }
        //e
        System.out.println("Intersecao");
        for (c = 0; c < 10; c++) {
            esta = x[c];
            for (j = 0; j < 10; j++) {
                if (esta == y[j]) {
                    System.out.println(esta);
                }
            }
        }
    }
}
