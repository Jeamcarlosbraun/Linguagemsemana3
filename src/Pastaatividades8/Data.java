package Pastaatividades8;

public class Data {
    private int dia;
    private int mes;
    private int ano;
    Data(int d, int m, int a){
        System.out.println("Objeto data criado");
        this.dataDeEntrada(d,m,a);
    }
    void dataDeEntrada(int d, int m, int a){
        if( this.dataEhValida(d,m,a) == true ){
            System.out.println("Data ok");
            this.dia = d;
            this.mes = m;
            this.ano = a;
        }else{
            this.dia = 0;
            this.mes = 0;
            this.ano = 0;
            System.out.println("Data nao ok");
        }
    }

    boolean dataEhValida(int d, int m, int a){
        if( d >= 1 && d <= 31 && m >= 1 && m <=12){
            System.out.println("dataehvalida: Data ok");
            System.out.println(d +" " + m + " "+ a);
            return true;
        }else{
            System.out.println(" dataehValida: Data nao ok");
            System.out.println(d +" " + m + " "+ a);
            return false;
        }
    }
    void imprimir(){
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }
}
