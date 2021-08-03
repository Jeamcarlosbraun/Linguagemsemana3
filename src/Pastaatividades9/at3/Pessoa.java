package Pastaatividades9.at3;
public class Pessoa {
    public String nome;
    public Pessoa pai;
    public Pessoa mae;
}
    public Pessoa (String nome, Pessoa pai, Pessoa mae){
    this.nome = nome;
    this.pai = pai;
    this.mae = mae;
    }
    public boolean igual (Pessoa outraPessoa){
    if(this.nome.equals(outraPessoa.nome)&& this.mae == outraPessoa.mae){
        return true;
    }else {
        return false;
    }
    public boolean eirmao(Pessoa outraPessoa){
        if(this.mae == outraPessoa.mae || this.pai == outraPessoa.pai){
            return true;
        }else {
            return false;
        }
        }
    public boolean antecessor(Pessoa outraPessoa){
        boolean status = false;
        if (outraPessoa == this.mae || outraPessoa == this.pai){
            return true;
        }else {
            status = this.mae.antecessor(outraPessoa);
            if (status == false) {
                status = this.pai.antecessor(outraPessoa);
            }
        }

        return status;
        }
}
