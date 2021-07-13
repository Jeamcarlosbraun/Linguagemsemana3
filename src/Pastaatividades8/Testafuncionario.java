package Pastaatividades8;
public class Testafuncionario {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.entradabanco = new Data(5,5,2005);
        f1.nome ="Joel";
        f1.departamento= "caixa";
        f1.rg ="145.366.809-12";
        f1.salario= 450;
        f1.recebeAumento(50);
        System.out.println("Funcionario 1:");
        f1.mostra();
        System.out.println("salario atual: " + f1.salario);
        System.out.println("ganho anual: "+ f1.calculaGanhoAnual());
        Funcionario f2 = new Funcionario();
        f2.nome ="Amanda";
        f2.departamento = "faxineira";
        f2.entradabanco = new Data (06,12,2008);
        f2.rg = "189.656.809-14";
        f2.salario =450;
        f2.recebeAumento(50);
        System.out.println("Funcionario 2:");
        f2.mostra();
        System.out.println("salario atual: " + f2.salario);
        System.out.println("ganho anual: "+ f2.calculaGanhoAnual());
        f1.nome = "Danilo";
        f1.salario = 100;
        f2.nome = "Danilo";
        f2.salario = 100;
        if (f1 == f2) {
            System.out.println("iguais");
        } else {
            System.out.println("diferentes");
        }
        f2 = f1;
        if(f1 ==f2) {
            System.out.println("iguais");
        } else
        {
            System.out.println("diferentes");
        }
    }
}
