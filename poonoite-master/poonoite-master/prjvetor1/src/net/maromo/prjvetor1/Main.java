package net.maromo.prjvetor1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int vetor[] = new int[10];
        //alimentar o vetor com dados aleatórios
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = random.nextInt(100);
        }

        //apresentando um vetor comum
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Pos[" + i + "] = " + vetor[i] );
        }
    }
}
