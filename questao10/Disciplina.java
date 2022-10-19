package questao10;

import questao08.Aluno;
import questao09.AlunoDeGraduacao;
import questao09.AlunoDePos;

import java.util.ArrayList;

public class Disciplina {
    String nome;
    ArrayList<Aluno> alunos;

    //item a
    public Disciplina(String nome){
        this.nome = nome;
        alunos = new ArrayList<>();
    }

    //item b
    public void addAluno(Aluno aluno){
        this.alunos.add(aluno);
    }

    //item c
    public void listarAlunosAprovados(){
        for (Aluno aluno:alunos) {
            double media = aluno.calcularMedia();
            if (aluno instanceof AlunoDeGraduacao && media >= 6) {
                System.out.println("Nome: " + aluno.nome);
                System.out.println("Média: " + media);
                System.out.println("Tipo de Aluno: Aluno de Graduação");
                System.out.println("============");
            }
            else if (aluno instanceof AlunoDePos && media >= 7) {
                System.out.println("Nome: " + aluno.nome);
                System.out.println("Média: " + media);
                System.out.println("Tipo de Aluno: Aluno de Pós");
                System.out.println("============");
            }
        }
    }

    //item d
    public double calcularMediaTotal(String tipoAluno){
        int qtde = 0;
        double medias = 0;
        for (Aluno aluno:alunos){
            if (tipoAluno == "graduacao" && aluno instanceof AlunoDeGraduacao){
                medias += aluno.calcularMedia();
                qtde++;
            } else if (tipoAluno == "pos" && aluno instanceof AlunoDePos) {
                medias += aluno.calcularMedia();
                qtde++;
            } else if (tipoAluno == "ambos") {
                medias += aluno.calcularMedia();
                qtde++;
            }
        }
        return medias/qtde;
    }

    //item e
    public ArrayList<Aluno> encontrarMelhoresAlunos(int qtde){
        ArrayList<Aluno> melhoresAlunos = new ArrayList<>();
        for (Aluno aluno: this.alunos){
            if (melhoresAlunos.size() < qtde) {
                melhoresAlunos.add(aluno);
            }
            else{
                double menorMedia = 10.0;
                int alunoMenorMediaIndex = 0;
                for (int i = 0; i<qtde; i++){
                    if (melhoresAlunos.get(i).calcularMedia() < menorMedia){
                        menorMedia = melhoresAlunos.get(i).calcularMedia();
                        alunoMenorMediaIndex = i;
                    }
                }
                if(aluno.calcularMedia() > menorMedia){
                    melhoresAlunos.set(alunoMenorMediaIndex, aluno);
                }
            }
        }

        for (Aluno aluno: melhoresAlunos) {
            System.out.println(aluno.getNome());
            System.out.println(aluno.calcularMedia());
        }

        return melhoresAlunos;
    }
}
