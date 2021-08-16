package Pastaatividades9.at5;

import java.util.ArrayList;

public class Escola {
    private ArrayList<CursoIdiomas> cursos = new ArrayList<>();

    public void addCurso(CursoIdiomas curso) {
        this.cursos.add(curso);
    }


    public void maiorReceita() {
        int codigo = 0;
        float maiorReceita = 0;
        for (CursoIdiomas curso : this.cursos) {
            float receita = curso.getAlunosMatriculados() * curso.getMensalidade();
            if (receita > maiorReceita) {
                maiorReceita = receita;
                codigo = curso.getCodigo();
            }
        }
        System.out.println("\nO curso " + codigo + " gera a maior receita");
    }
}
