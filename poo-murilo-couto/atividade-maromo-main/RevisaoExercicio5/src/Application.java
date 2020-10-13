public class Application {

    public static void main(String[] args) {
        GameController gameController = new GameController();
        Jogador jogador = new Jogador();
        int number;

        int cont = 1;
        do {
            number = gameController.generateNumber();
            jogador.row(number);
            cont++;
            System.out.println(cont);
        } while (!jogador.isCartelaComplete());
    }
}
