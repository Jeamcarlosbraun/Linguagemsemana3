package Pastaatividades10.at2;

public class Telefonista extends Funcionario {
    private int estacaoDeTrabalho;

    public void mostrarDados() {
        System.out.println("\nTELEFONISTA");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Estação de trabalho: " + this.getEstacaoDeTrabalho());
        System.out.println("Bonificação: " + this.calculaBonificacao());
    }

    public int getEstacaoDeTrabalho() {
        return estacaoDeTrabalho;
    }

    public void setEstacaoDeTrabalho(int estacaoDeTrabalho) {
        this.estacaoDeTrabalho = estacaoDeTrabalho;
    }


}

