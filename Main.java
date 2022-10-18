import questao08.Aluno;
import questao09.AlunoDeGraduacao;
import questao09.AlunoDePos;
import questao10.Disciplina;

import java.util.ArrayList;

//questao 11
public class Main {
    public static void main(String[] args) {
        AlunoDeGraduacao aluno1 = new AlunoDeGraduacao("Maria", "2020.1");
        aluno1.setNota1(10);
        aluno1.setNota2(7);

        AlunoDeGraduacao aluno2 = new AlunoDeGraduacao("Eduarda", "2020.2");
        aluno2.setNota1(5);
        aluno2.setNota2(9);

        AlunoDeGraduacao aluno3 = new AlunoDeGraduacao("Clara", "2021.1");
        aluno3.setNota1(3);
        aluno3.setNota2(6.8);

        AlunoDeGraduacao aluno4 = new AlunoDeGraduacao("Ana", "2019.2");
        aluno4.setNota1(9.2);
        aluno4.setNota2(7.5);

        AlunoDePos aluno5 = new AlunoDePos("Claudia", "Paulo Henrique");
        aluno5.setNota1(8.7);
        aluno5.setNota2(5.9);

        AlunoDePos aluno6 = new AlunoDePos("Laura", "Gustavo");
        aluno6.setNota1(7.2);
        aluno6.setNota2(8.7);

        AlunoDePos aluno7 = new AlunoDePos("Helena", "Rafael");
        aluno7.setNota1(8.1);
        aluno7.setNota2(6.8);

        Disciplina disciplina = new Disciplina("PEOO");
        disciplina.addAluno(aluno1);
        disciplina.addAluno(aluno2);
        disciplina.addAluno(aluno3);
        disciplina.addAluno(aluno4);
        disciplina.addAluno(aluno5);
        disciplina.addAluno(aluno6);
        disciplina.addAluno(aluno7);

        System.out.println("Lista de Alunos aprovados:");
        disciplina.listarAlunosAprovados();
        System.out.println("-------------------");

        System.out.println("Média total da Graduação: " + disciplina.calcularMediaTotal("graduacao"));
        System.out.println("Média total da Pós: " + disciplina.calcularMediaTotal("pos"));
        System.out.println("Média total da Disciplina: " + disciplina.calcularMediaTotal("ambos"));
        System.out.println("--------------------");

        ArrayList<Aluno> melhoresAlunos = disciplina.encontrarMelhoresAlunos(5);
        System.out.println("5 Melhores Alunos");
        for (Aluno aluno: melhoresAlunos){
            System.out.println(aluno.nome + " com média " + aluno.calcularMedia());
        }
    }
}
