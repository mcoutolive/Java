package net.maromo.prjvetor2;

public class Main {

    public static void main(String[] args) {
	    //matriz quadrada de 7 x 7
        int matriz[][] = new int[7][7];
        //gerar uma matriz identidade
        for (int i = 0; i < 7; i++) {
            matriz[i][i] = 1;
        }
        //percorrer a matriz
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.printf("[%3d] ", matriz[i][j]);
            }
            System.out.println();
        }
    }
}
