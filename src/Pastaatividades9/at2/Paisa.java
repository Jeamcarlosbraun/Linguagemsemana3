package Pastaatividades9.at2;

import java.util.ArrayList;

public class Paisa {
    private String codigoIso;
    private String nome;
    private Integer pop;
    private Double dimensao;
    public ArrayList<Pastaatividades9.at1.Pais> paisFronteira = new ArrayList<Pastaatividades9.at1.Pais>();

    public Paisa(String codigoIso, String nome, Double dimensao, Integer pop) {
        this.codigoIso = codigoIso;
        this.nome = nome;
        this.dimensao = dimensao;
        this.pop = pop;
    }

    public String getCodigoIso() {
        return codigoIso;
    }

    public void setCodigoIso(String codigoIso) {
        this.codigoIso = codigoIso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPop() {
        return pop;
    }

    public void setPop(Integer pop) {
        this.pop = pop;
    }

    public Double getDimensao() {
        return dimensao;
    }

    public void setDimensao(Double dimensao) {
        this.dimensao = dimensao;
    }

    public boolean ehOMesmoPais(Paisa outroPais) {
        if (this.codigoIso.equals(outroPais.getCodigoIso())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean ehLimitrofe(Paisa outroPais) {
        if (this.paisFronteira.contains(outroPais)) {
            return true;
        } else {
            return false;
        }
    }
}

