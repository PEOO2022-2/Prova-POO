package questao09;

import questao08.Aluno;

public class AlunoDeGraduacao extends Aluno {
    private String semestreDeEntrada;

    public AlunoDeGraduacao(String nome, String semestreDeEntrada) {
        super(nome);
        this.semestreDeEntrada = semestreDeEntrada;
    }

    @Override
    public double calcularMedia() {
        return (this.nota1 + this.nota2)/2;
    }
}
