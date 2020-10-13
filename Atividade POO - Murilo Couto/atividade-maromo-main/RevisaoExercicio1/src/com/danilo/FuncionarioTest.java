package com.danilo;

import java.util.Scanner;

public class FuncionarioTest {

    public static void main(String[] args) {

        Funcionario func = new Funcionario();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o id do colaborador:");
        func.setIdFunc(sc.nextInt());
        System.out.println("Entre com o nome do colaborador:");
        func.setNomeFunc(sc.next());
        System.out.println("Entre com o departamento do colaborador:");
        func.setDepartamento(sc.next());
        System.out.println("Entre com a data de contratacao do colaborador:");
        func.setDataContratacao(sc.next());
        System.out.println("Entre com o salario do colaborador:");
        func.setSalario(sc.nextDouble());
        System.out.println("Entre com o documento do colaborador:");
        func.setDocumento(sc.next());


        System.out.println("Entre com o aumento:");
        func.atualizarSalario(sc.nextDouble());

        func.imprimir();

        func.demiteFuncionario();

        func.imprimir();

    }
}
