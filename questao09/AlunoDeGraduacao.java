package questao09;

import questao08.Aluno;

public class AlunoDeGraduacao extends Aluno {
    public int semestreAtual;

    public AlunoDeGraduacao(String nome) {
        super(nome);
    }

    @Override
    public float calcularMedia() {
        return (this.nota1 + this.nota2)/2;
    }
}
