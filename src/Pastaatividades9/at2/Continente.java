package Pastaatividades9.at2;
import java.util.ArrayList;
public class Continente {
    public String nome;
    public ArrayList<Paisa> paises = new ArrayList<Paisa>();
    public  Continente(String nome){
        this.nome = nome;
    }
    public  void adiciona (Paisa p){
        this.paises.add(p);
    }
    public float dimensaoc(){
        float soma = 0;
        for(Paisa p : this.paises){
            soma = (float) (soma + p.getDimensao());
        }
        return soma;
    }
    public int continentepop(){
        float soma = 0;
        for(Paisa p : this.paises){
            soma = (soma+p.getPop());
        }
        return (int) soma;
    }

    public float denspop(){
        return  (float) this.continentepop() / this.dimensaoc();
    }
    public Paisa maiorPop(){
        Paisa maiorpopulacao = this.paises.get(0);

        for (int i=1; i<this.paises.size();i++){
            Paisa p = this.paises.get(i);
            if(p.getPop()>maiorpopulacao.getPop()) {
                maiorpopulacao = p;
            }
        }
        return maiorpopulacao;
    }
    public Paisa menorPop(){
        Paisa menorpopulacao = this.paises.get(0);

        for (int i=1; i<this.paises.size();i++){
            Paisa p = this.paises.get(i);
            if(p.getPop() < menorpopulacao.getPop()) {
                menorpopulacao = p;
            }
        }
        return menorpopulacao;
    }
    public Paisa maiordimensao(){
        Paisa maiordimensao = this.paises.get(0);

        for (int i=1; i<this.paises.size();i++){
            Paisa p = this.paises.get(i);
            if(p.getPop()>maiordimensao.getPop()) {
                maiordimensao = p;
            }
        }
        return maiordimensao;
    }
    public Paisa menordimensao() {
        Paisa menordimensao = this.paises.get(0);

        for (int i = 1; i < this.paises.size(); i++) {
            Paisa p = this.paises.get(i);
            if (p.getPop() < menordimensao.getPop()) {
                menordimensao = p;
            }
        }
        return menordimensao;
    }
    public float razao(){
        Paisa maior = this.maiordimensao();
        Paisa menos = this.menordimensao();
        return (float) (maior.getDimensao()/menos.getDimensao());
    }
    }
