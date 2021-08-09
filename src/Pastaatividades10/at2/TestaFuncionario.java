package Pastaatividades10.at2;

public class TestaFuncionario {
    public static void main(String[] args) {

        Gerente g = new Gerente();
        g.setNome("Jeam");
        g.setSalario(1234);
        g.setUsuario("Jeam Braun");
        g.setSenha("643");

        Telefonista t = new Telefonista();
        t.setNome("Teste");
        t.setSalario(6543);
        t.setEstacaoDeTrabalho(1245);

        Secretaria s = new Secretaria();
        s.setNome("Amanda");
        s.setSalario(2600);
        s.setRamal(123);

         System.out.println("\nGERENTE");
         System.out.println("Nome: " + g.getNome());
         System.out.println("Salário: " + g.getSalario());
         System.out.println("Usuário: " + g.getUsuario());
         System.out.println("Senha: " + g.getSenha());
         System.out.println("Bonificação: " + g.calculaBonificacao());

         System.out.println("\nTELEFONISTA");
         System.out.println("Nome: " + t.getNome());
         System.out.println("Salário: " + t.getSalario());
         System.out.println("Estação de trabalho: " + t.getEstacaoDeTrabalho());
         System.out.println("Bonificação: " + t.calculaBonificacao());

         System.out.println("\nSECRETARIA");
         System.out.println("Nome: " + s.getNome());
         System.out.println("Salário: " + s.getSalario());
         System.out.println("Ramal: " + s.getRamal());
         System.out.println("Bonificação: " + s.calculaBonificacao());

        g.mostrarDados();
        t.mostrarDados();
        s.mostrarDados();

    }

}
