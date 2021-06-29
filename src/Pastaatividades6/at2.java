package Pastaatividades6;
import java.util.ArrayList;
import java.util.Collections;

public class at2 {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<String>();
        nomes.add("Jeam");
        nomes.add("Lucas");
        nomes.add("Eduarda");
        nomes.add("Danielle");
        nomes.add("Pablo");
        nomes.add("Matheus");
        nomes.add("Amanda");
        nomes.add("Teresinha");
        nomes.add("Orlando");
        Collections.sort(nomes);
        for (String imprime : nomes){
            System.out.println(imprime);
        }
    }
}
