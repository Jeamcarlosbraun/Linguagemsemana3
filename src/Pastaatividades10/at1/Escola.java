package Pastaatividades10.at1;
import java.util.ArrayList;

public class Escola {

    ArrayList<PessoaEscola> Pessoas = new ArrayList<PessoaEscola>();

    public void imprimir() {
        for (PessoaEscola pe : Pessoas) {
            System.out.println(pe.getNome());
            System.out.println(pe.getClass());
        }

    }

    public static void main(String[] args) {

        Escola pps = new Escola();

        Docentes Jeam = new Docentes();
        Jeam.setNome("Jeam");
        Jeam.setCPF(12345677);
        Jeam.setFormacao("formado em...");
        pps.Pessoas.add(Jeam);

        TAE Sandra = new TAE();
        Sandra.setNome("Amanda");
        Sandra.setCPF(456723);
        Sandra.setReunioes("24/3/2021 10:00 - etcetcetc");
        pps.Pessoas.add(Sandra);

        pps.imprimir();

    }
}