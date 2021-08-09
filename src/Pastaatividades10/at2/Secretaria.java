package Pastaatividades10.at2;

public class Secretaria extends Funcionario {
    private int ramal;

    public void mostrarDados() {
        System.out.println("\nSECRETARIA");
        System.out.println("Nome: " + this.getNome());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Ramal: " + this.getRamal());
        System.out.println("Bonificação: " + this.calculaBonificacao());
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }


}
