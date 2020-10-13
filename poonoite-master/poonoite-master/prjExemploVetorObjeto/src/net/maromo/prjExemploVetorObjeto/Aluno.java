package net.maromo.prjExemploVetorObjeto;

public class Aluno {
    private int ra;
    private String nomeAluno;
    private String turma;

    public int getRa() {
        return ra;
    }

    public void setRa(int ra) {
        this.ra = ra;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public void imprimir(){
        System.out.println("ra = " + ra);
        System.out.println("nomeAluno = " + nomeAluno);
        System.out.println("turma = " + turma);
    }
}
