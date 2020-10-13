import java.util.Random;

public class Jogador {

    private Random random = new Random();
    private int cartela[][] = new int[4][6];
    private int cartelaAcertos[][] = new int[4][6];

    public Jogador() {
        generateCartela();
    }

    private void generateCartela() {
        int number;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                do {
                    number = random.nextInt(74) + 1;
                } while (verifyNumberExists(number));
                cartela[i][j] = number;
            }
        }
    }

    private boolean verifyNumberExists(int number) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                if (cartela[i][j] == number) {
                    return true;
                }
            }
        }
        return false;
    }

    public void row(int number) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                if (cartela[i][j] == number) {
                    cartelaAcertos[i][j] = number;
                    return;
                }
            }
        }
    }

    public boolean isCartelaComplete() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                if (cartelaAcertos[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public void imprimirCartela() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("\t" + cartela[i][j]);
            }
            System.out.println("");
        }
    }
}
