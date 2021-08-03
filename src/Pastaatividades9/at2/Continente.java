package Pastaatividades9.at2;
import java.util.ArrayList;
public class Continente {
    public String nome;
    public ArrayList<Pais> paises = new ArrayList<Pais>();
    public  Continente(String nome){
        this.nome = nome;
    }
    public  void adiciona (Pais p){
        this.paises.add(p);
    }
    public float dimensaoc(){
        float soma = 0;
        for(Pais p : this.paises){
            soma = (float) (soma + p.getDimensao());
        }
        return soma;
    }
    public int continentepop(){
        float soma = 0;
        for(Pais p : this.paises){
            soma = (soma+p.getPop());
        }
        return (int) soma;
    }

    public float denspop(){
        return  (float) this.continentepop() / this.dimensaoc();
    }
    public Pais maiorPop(){
        Pais maiorpopulacao = this.paises.get(0);

        for (int i=1; i<this.paises.size();i++){
            Pais p = this.paises.get(i);
            if(p.getPop()>maiorpopulacao.getPop()) {
                maiorpopulacao = p;
            }
        }
        return maiorpopulacao;
    }
    public Pais menorPop(){
        Pais menorpopulacao = this.paises.get(0);

        for (int i=1; i<this.paises.size();i++){
            Pais p = this.paises.get(i);
            if(p.getPop() < menorpopulacao.getPop()) {
                menorpopulacao = p;
            }
        }
        return menorpopulacao;
    }
    public Pais maiordimensao(){
        Pais maiordimensao = this.paises.get(0);

        for (int i=1; i<this.paises.size();i++){
            Pais p = this.paises.get(i);
            if(p.getPop()>maiordimensao.getPop()) {
                maiordimensao = p;
            }
        }
        return maiordimensao;
    }
    public Pais menordimensao() {
        Pais menordimensao = this.paises.get(0);

        for (int i = 1; i < this.paises.size(); i++) {
            Pais p = this.paises.get(i);
            if (p.getPop() < menordimensao.getPop()) {
                menordimensao = p;
            }
        }
        return menordimensao;
    }
    public float razao(){
        Pais maior = this.maiordimensao();
        Pais menos = this.menordimensao();
        return (float) (maior.getDimensao()/menos.getDimensao());
    }
    }
