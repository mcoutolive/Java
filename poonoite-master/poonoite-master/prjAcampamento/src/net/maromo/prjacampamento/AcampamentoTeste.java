package net.maromo.prjacampamento;

import java.util.Scanner;

public class AcampamentoTeste {

    public static void main(String[] args) {
	    Acampamento membro = new Acampamento();
	    //Entrada manual. Pedir
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o nome do membro do acampamento: ");
        membro.setNome(leitor.nextLine());

        System.out.println("Digite a idade do membro: ");
        membro.setIdade(Integer.parseInt(leitor.nextLine()));

        membro.imprimir();

        membro.separarGrupo();

        membro.imprimir();

    }
}
