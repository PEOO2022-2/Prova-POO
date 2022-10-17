package questao09;

import questao08.Aluno;

public class AlunoDePos extends Aluno {
    public int semestreAtual;

    public AlunoDePos(String nome) {
        super(nome);
    }

    @Override
    public double calcularMedia() {
        return (float) ((this.nota1*0.4 + this.nota2*0.6)/10);
    }
}
