package net.maromo.prjacademico;

public class Aluno {
    //Atributos
    public int rm;
    public String nome;
    public String email;

    public void matricular(){
        //Escrever o código da funcionalidade matricular
        System.out.println("Aluno Matriculado com Sucesso.");
        System.out.println("Dados do Aluno: ");
        System.out.println(imprimir());
        System.out.println("-------------------------------");
    }

    private String imprimir() {
        return "RM: " + rm + ", Nome: " + nome + ", Email: " + email;
    }

    public void cancelarMatricula(){
        //Escrever o código para cancelar matrícula
        System.out.println("Aluno Com Matricula Cancelada. ");
        System.out.println("Dados do Ex-aluno: ");
        System.out.println(imprimir());
        System.out.println("--------------------------------");
    }
}
