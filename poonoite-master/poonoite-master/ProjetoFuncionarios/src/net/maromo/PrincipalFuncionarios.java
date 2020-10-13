package net.maromo;

import java.util.Scanner;

public class PrincipalFuncionarios {
    public final int T = 10;
    public int indice = 0;
    public Funcionario[] func = new Funcionario[T];

    public static void main(String[] args) {
        PrincipalFuncionarios principal = new PrincipalFuncionarios();
        Scanner sc = new Scanner(System.in);
        int opc;
        do{
            System.out.println();
            System.out.println("Menu Principal");
            System.out.println("1.. Cadastrar");
            System.out.println("2.. Bonificar");
            System.out.println("3.. Consultar");
            System.out.println("9.. Sair");
            opc = Integer.parseInt(sc.nextLine());
            switch (opc){
                case 1:
                    principal.execCadastro();
                    break;
                case 2:
                    principal.execBonificacao();
                    break;
                case 3:
                    principal.execConsulta();
                    break;
                case 9:
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opc!=9);
    }

    public void execCadastro(){
        Scanner sc = new Scanner(System.in);
        if(this.indice<=this.T){
            this.func[indice] = new Funcionario();
            System.out.println("Digite o nome do funcionario");
            this.func[indice].setNome(sc.nextLine());
            System.out.println("Digite o departamento");
            this.func[indice].setDepartamento(sc.nextLine());
            System.out.println("Digite o Salario");
            this.func[indice].setSalario(Double.parseDouble(sc.nextLine()));
            System.out.println("Digite o RG");
            this.func[indice].setRg(sc.nextLine());
            this.func[indice].setNaEmpresa(true);
            this.indice++;
            System.out.println("Cadastrado com sucesso ");
        }else{
            System.out.println("Só passo cadastrar " + this.T + " funcionarios");
        }
    }
    public void execBonificacao(){
        String rgProc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o rg do funcionario a ser bonificado ");
        rgProc = sc.nextLine();
        for(Funcionario f : this.func){
            //obrigatorio que vc cheque antes de procurar se há ref.
            if(f != null){
                if(rgProc.equals(f.getRg())){
                    System.out.println("Digite o valor do aumento");
                    double aumento = Double.parseDouble(sc.nextLine());
                    f.bonificar(aumento);
                    System.out.println("Funcionario encontrado e bonificado");
                    return;
                }
            }
        }
        System.out.println("Funcionario não encontrado");
    }
    public void execConsulta(){
        for (Funcionario f: this.func) {
            if( f != null){
                System.out.println(f.toString());
            }
        }
    }
}
