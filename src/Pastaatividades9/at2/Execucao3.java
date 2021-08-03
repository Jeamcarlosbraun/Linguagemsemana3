package Pastaatividades9.at2;

public class Execucao3 {
    public static void main(String[] args) {
        Pais p1 = new Pastaatividades9.at1.Pais("BRA", "BRASIL", 2003.1, 102);
        Pais p2 = new Pastaatividades9.at1.Pais("ARG", "ARGENTINA", 2000.3, 103);
        Pais p3 = new Pastaatividades9.at1.Pais("URU", "URUGUAI", 2040.4, 104);
        Pais p4 = new Pastaatividades9.at1.Pais("EQU", "EQUADOR", 2000.6, 130);
        Pais p5 = new Pastaatividades9.at1.Pais("BOL", "BOLÍVIA", 2005.7, 130);
/*
        p1.paisFronteira.add(p2);
        p1.paisFronteira.add(p3);
        p1.paisFronteira.add(p5);
        p2.paisFronteira.add(p1);
        p2.paisFronteira.add(p3);
        p2.paisFronteira.add(p5);
        p3.paisFronteira.add(p1);
        p3.paisFronteira.add(p2);
        p5.paisFronteira.add(p1);
        p5.paisFronteira.add(p2);

        System.out.print("p1 é igual ao p2? ");
        boolean resp = p1.ehOMesmoPais(p2);
        System.out.println(resp);

        System.out.print("Argentina faz fronteira com o Brasil?");
        resp = p2.ehLimitrofe(p1);
        System.out.println(resp);

        System.out.println("Paises que fazem fronteira com o Brasil e com a Argentina:");
        ArrayList<Pastaatividades9.at1.Pais> comuns = p1.vizinhosComuns(p2);
        for(Pais p : comuns){
            System.out.println(p.getNome());
        }

*/
    Continente america = new Continente("America");
    america.adiciona(p1);
    america.adiciona(p2);
    america.adiciona(p3);
    america.adiciona(p4);
    america.adiciona(p5);
    }
}
