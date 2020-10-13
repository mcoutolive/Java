package net.maromo.prjvetor4;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int vetor[] = new int[100];

        Arrays.fill(vetor, 99);


        for (int i = 0; i < 100; i++) {
            System.out.println(vetor[i]);
        }
    }
}
