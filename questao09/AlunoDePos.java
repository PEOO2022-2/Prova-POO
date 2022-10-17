package questao09;

import questao08.Aluno;

public class AlunoDePos extends Aluno {
    private String nomeOrientador;

    public AlunoDePos(String nome, String nomeOrientador) {
        super(nome);
        this.nomeOrientador = nomeOrientador;
    }

    @Override
    public double calcularMedia() {
        return ((this.nota1*4 + this.nota2*6)/10);
    }
}
