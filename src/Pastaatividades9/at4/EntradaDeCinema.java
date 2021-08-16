package Pastaatividades9.at4;

import javax.xml.crypto.Data;
import java.text.DateFormat;
import java.util.Date;

public class EntradaDeCinema {
    private Date dataDoFilme;
    private float horario;
    private int sala;
    public float valor;

    public EntradaDeCinema(Date dataDoFilme, float horario, int sala, float valor) {
        this.dataDoFilme = dataDoFilme;
        this.horario = horario;
        this.sala = sala;
        this.valor = valor;
    }


    public void calculaDesconto(Date nascimentoCliente) {
        int idade = calculaIdade(nascimentoCliente);

        if (idade < 12) {
            this.valor = this.valor / 2;
        }
        descontoHorario();
    }

    public void forString(){
        System.out.println("Data: "+this.dataDoFilme);
        System.out.println("Horário: "+this.horario);
        System.out.println("Sala: "+this.sala);
        System.out.println("Valor: "+this.valor);
        System.out.println();
    }

    public void calculaDescontoEstudante(Date nascimentoCliente, int carteirinha) {
        int idade = calculaIdade(nascimentoCliente);

        if (idade <= 15 && idade >= 12) {
            this.valor -= this.valor * 40 / 100;
        }

        if (idade <= 20 && idade >= 16) {
            this.valor -= this.valor * 30 / 100;
        }

        if (idade > 20) {
            this.valor -= this.valor * 20 / 100;
        }
        descontoHorario();
    }

    public void descontoHorario(){
        if(this.horario < 16){
            this.valor -= this.valor*10/100;
        }
    }

    public String formataData(Date data) {
        String dataTexto = java.text.DateFormat.getDateInstance(DateFormat.MEDIUM).format(data);
        return dataTexto;
    }

    public int calculaIdade(Date nascimentoCliente) {
        String nascimentoClienteText = formataData(nascimentoCliente);
        String[] dataSeparada = nascimentoClienteText.replaceAll("/", " ").split(" ");
        int diaAniversario = Integer.parseInt(dataSeparada[0].trim());
        int mesAniversario;
        mesAniversario = Integer.parseInt(dataSeparada[1].trim());
        int anoAniversario = Integer.parseInt(dataSeparada[2].trim());

        String dataAtual = formataData(new Date());
        String[] dataAtualSeparada = dataAtual.replaceAll("/", " ").split(" ");
        int diaAtual = Integer.parseInt(dataAtualSeparada[0].trim());
        int mesAtual = Integer.parseInt(dataAtualSeparada[1].trim());
        int anoAtual = Integer.parseInt(dataAtualSeparada[2].trim());

        int idade = anoAtual - anoAniversario;
        int diferencaMes = mesAtual - mesAniversario;
        int diferencaDia = diaAtual - diaAniversario;

        if (diferencaMes < 0 || (diferencaMes == 0 && diferencaDia < 0)) {
            idade--;
        }

        return idade;

    }

}
