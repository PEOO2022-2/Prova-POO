package questao09;

import questao08.Aluno;

public class AlunoDeMestrado extends Aluno {
    public int semestreAtual;

    public AlunoDeMestrado(String nome) {
        super(nome);
    }

    @Override
    public float calcularMedia() {
        return (float) ((this.nota1*0.4 + this.nota2*0.6)/10);
    }
}
