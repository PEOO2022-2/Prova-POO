package questao11;

import questao09.AlunoDeGraduacao;
import questao09.AlunoDePos;
import questao10.Disciplina;

public class Main {
    public static void main(String[] args) {
        Disciplina disciplina = new Disciplina("POO");
        AlunoDeGraduacao jorgin = new AlunoDeGraduacao("Jorgin", "2");
        AlunoDeGraduacao maricota = new AlunoDeGraduacao("Maricota", "2");
        AlunoDeGraduacao pedrinho = new AlunoDeGraduacao("Pedrinho", "2");
        AlunoDePos tonin = new AlunoDePos("Tonin", "Paulo Henrique");
        AlunoDePos juju = new AlunoDePos("Juju", "Paulo Henrique");

        disciplina.addAluno(jorgin);
        disciplina.addAluno(maricota);
        disciplina.addAluno(pedrinho);
        disciplina.addAluno(tonin);
        disciplina.addAluno(juju);

        disciplina.listarAlunosAprovados();
        disciplina.calcularMediaTotal("ambos");
        disciplina.encontrarMelhoresAlunos(5);
    }
}
