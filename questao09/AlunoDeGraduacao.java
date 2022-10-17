package questao09;

import questao08.Questao08;

public class AlunoDeGraduacao extends Questao08 {
    public int semestreAtual;

    public AlunoDeGraduacao(String nome) {
        super(nome);
    }

    @Override
    public float calcularMedia() {
        return (this.nota1 + this.nota2)/2;
    }
}
