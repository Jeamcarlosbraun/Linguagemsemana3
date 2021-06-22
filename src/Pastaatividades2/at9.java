package Pastaatividades2;

import java.util.Scanner;

public class at9 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome;
        float dependentes=0, salariobruto=0,salarioliquido=0,desconto=0,gastosalario=0,totaldescontado=0;
        int horastrabalhadas=0, numerofuncionarios;
        System.out.println("Digite o numero de funcionarios:");
        numerofuncionarios = ler.nextInt();
        for(int x=0;x < numerofuncionarios;x++){
            System.out.println ("Digite seu nome");
            nome= ler.next();
            System.out.println("Digite o numero de dependentes");
            dependentes = ler.nextInt();
            System.out.println("Digite o numero de horas trabalhadas");
            horastrabalhadas = ler.nextInt();
            salariobruto = horastrabalhadas*100 + dependentes*125.55f;
            salarioliquido = salariobruto *0.88f;
            desconto = salariobruto *0.12f;
            gastosalario = salariobruto + gastosalario;
            totaldescontado = desconto + totaldescontado;
            System.out.println("Nome"+nome);
            System.out.println("Salario bruto:"+salariobruto);
            System.out.println("Salario liquido:"+salarioliquido);
            System.out.println("Desconto:"+desconto);
        }
        System.out.println("Tem "+numerofuncionarios+ " funcionarios");
        System.out.println("O valor gasto com salario e:"+gastosalario);
        System.out.println("O valor descontado e de:n"+totaldescontado);
        ler.close();
    }
}
