package Pastaatividades9.at5;

import java.util.ArrayList;

public class CursoIdiomas {
    private int codigo;
    private int alunosMatriculados;
    private float mensalidade;
    private ArrayList<Turma> turma = new ArrayList<>();

    public CursoIdiomas(int codigo, int alunosMatriculados, float mensalidade) {
        this.codigo = codigo;
        this.alunosMatriculados = alunosMatriculados;
        this.mensalidade = mensalidade;
    }

    public void adicionaTurma(Turma turma) {
        this.turma.add(turma);
        this.alunosMatriculados += turma.getAlunos().size();
    }

    public void alunosAprovados() {
        int aprovados = 0;
        for (Turma turma : this.turma) {
            for (Alunos aluno : turma.getAlunos()) {
                if (aluno.isAprovado()) {
                    aprovados++;
                }
            }
        }
        System.out.println("\nCurso "+ this.codigo +". Alunos aprovados: " + aprovados);
    }

    public void alunosReprovados() {
        int reprovados = 0;
        for (Turma turma : this.turma) {
            for (Alunos aluno : turma.getAlunos()) {
                if (!aluno.isAprovado()) {
                    reprovados++;
                }
            }
        }
        System.out.println("\nCurso "+ this.codigo +". Alunos reprovados: " + reprovados);
    }

    public int getAlunosMatriculados() {
        return alunosMatriculados;
    }

    public float getMensalidade() {
        return mensalidade;
    }

    public int getCodigo() {
        return codigo;
    }
}
