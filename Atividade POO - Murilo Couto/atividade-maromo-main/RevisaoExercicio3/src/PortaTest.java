public class PortaTest {
    public static void main(String[] args) {
        Porta p1 = new Porta(false, "Marrom", 70.0, 210.0, 3.0);

        p1.abre();
        System.out.println("\n Porta aberta!");
        p1.fecha();
        System.out.println("Porta fechada!");
        p1.pinta("Azul");
        System.out.println("Porta pintada de azul!");
        p1.pinta("Verde");
        System.out.println("Porta pintada de verde!");
        p1.pinta("Amarelo");
        System.out.println("Porta pintada de amarelo!");
        p1.pinta("Vermelho");
        System.out.println("Porta pintada de vermelho!");
        p1.pinta("Branco");
        System.out.println("Porta pintada de branco!");
        p1.pinta("Preto");
        System.out.println("Porta pintada de preto!");
        p1.pinta("Roxo");
        System.out.println("Porta pintada de roxo!");

        p1.alterarDim(90.2, 250.0, 3.6);
        System.out.println("Dimensões da porta foram alteradas!");

        p1.estaAberta();

    }
}
