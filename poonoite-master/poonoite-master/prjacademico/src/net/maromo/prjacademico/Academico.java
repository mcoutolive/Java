package net.maromo.prjacademico;

public class Academico {
    //sem atributos (poderia ter)

    public static void main(String[] args) {
	// código fonte para executar aplicação
        Aluno aluno1, aluno2; //definimos as variáveis
        int x = 10;
        aluno1 = new Aluno();
        aluno1.rm = 1;
        aluno1.nome = "Joao";
        aluno1.email = "emaildojoao@joao.com";

        aluno2 = new Aluno();
        aluno2.rm = 2;
        aluno2.nome = "Pedro";
        aluno2.email = "emaildopedro@pedro.com";

        //Matricular os dois alunos
        aluno1.matricular();
        aluno2.matricular();

        //Cancelar a matricula dos dois alunos
        aluno1.cancelarMatricula();
        aluno2.cancelarMatricula();

    }
}
