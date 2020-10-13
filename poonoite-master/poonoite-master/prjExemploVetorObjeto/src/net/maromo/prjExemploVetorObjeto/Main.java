package net.maromo.prjExemploVetorObjeto;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Aluno[] vetAlunos = new Aluno[3];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            vetAlunos[i] = new Aluno();
            System.out.println("Digite o ra do aluno: ");
            vetAlunos[i].setRa(Integer.parseInt(sc.nextLine()));
            System.out.println("Digite o nome do aluno: ");
            vetAlunos[i].setNomeAluno(sc.nextLine());
            System.out.println("Digite o nome da turma: ");
            vetAlunos[i].setTurma(sc.nextLine());
            System.out.println("Cadastrado com sucesso");
        }

        //imprimir
        //for (int i = 0; i < 3; i++) {
        //    vetAlunos[i].imprimir();
        //}
        for (Aluno aluno : vetAlunos) {
            aluno.imprimir();
        }
    }
}
