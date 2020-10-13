public class CasaTest {
    public static void main(String[] args) {
        Casa casa = new Casa("Branca",new Porta(true),new Porta(true), new Porta(true));

        casa.pinta("Bege");
        System.out.println("\nA casa está pintada de " + casa.getCor() + "!");
        casa.getPorta1().abre();
        casa.getPorta2().fecha();
        casa.getPorta3().abre();
        casa.qtdPortasAbertas();

    }
}
