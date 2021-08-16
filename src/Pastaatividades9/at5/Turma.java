package Pastaatividades9.at5;

public class Turma {

    public static void main(String[] args) {
        Escola escola = new Escola();

        CursoIdiomas cursoEspanhol = new CursoIdiomas(111, 0, 250.0f);
        escola.addCurso(cursoEspanhol);
        CursoIdiomas cursoIngles = new CursoIdiomas(222, 0, 350.0f);
        escola.addCurso(cursoIngles);
        CursoIdiomas cursoAlemao = new CursoIdiomas(333, 0, 200.0f);
        escola.addCurso(cursoAlemao);


        Alunos aluno0 = new Alunos(18.8f);


        Turma turma1 = new Turma();
        Alunos aluno1 = new Alunos(8.8f);
        turma1.adicionaAluno(aluno1);
        Alunos aluno2 = new Alunos(6.5f);
        turma1.adicionaAluno(aluno2);
        Alunos aluno3 = new Alunos(7.5f);
        turma1.adicionaAluno(aluno3);
        Alunos aluno4 = new Alunos(7);
        turma1.adicionaAluno(aluno4);
        Alunos aluno5 = new Alunos(4.8f);
        turma1.adicionaAluno(aluno5);

        Alunos aluno6 = new Alunos(8.8f);
        turma1.adicionaAluno(aluno6);
        cursoAlemao.adicionaTurma(turma1);

        cursoAlemao.alunosAprovados();
        cursoAlemao.alunosReprovados();

        escola.maiorReceita();

    }
}
