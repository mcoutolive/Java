package net.maromo.prjconversao2;

import java.util.Scanner;

public class Main {
/* igual a c
    comentario de varias linhas
 */

    public static void main(String[] args) {
	    // Pedir para o usuario entrar com dois valores
        //Leia um buffer de teclado
        int a, b, soma;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite o valor de A: ");
        a =  Integer.parseInt(input.nextLine());
        System.out.println("Digite o valor de B: ");
        b = Integer.parseInt(input.nextLine());
        soma = a + b;
        System.out.println("Soma dos valores: " + soma);
        for (int i = 10; i > 0; i--) {
            System.out.println("Valor de i: " + i);
        }
        //do
        boolean ativo = true;
        int x = 134;
        while(ativo){
            System.out.println("Faco operacao");
            System.out.println("Valor de x: " + x);
            x--;
            if(x % 4 == 0){
                ativo = false;
            }
        }
        int y = 13;
        do{
            y--;
            System.out.printf("Y: %d \n", y);
            if(y % 5 ==0) break;
        }while(true);

    }
}
