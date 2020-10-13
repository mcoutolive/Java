package net.maromo.prjveetor3;

public class Main {

    public static void main(String[] args) {
	    int vetor1[] = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
	    int vetor2[] = new int[10];
	    System.arraycopy(vetor1, 3, vetor2, 7, 3);

	    //percorrer o primeiro
        for (int i = 0; i < 10; i++) {
            System.out.printf("%2d ", vetor1[i]);
        }
        System.out.println();

        //percorrer o segundo
        for (int i = 0; i < 10; i++) {
            System.out.printf("%2d ", vetor2[i]);
        }
    }
}
