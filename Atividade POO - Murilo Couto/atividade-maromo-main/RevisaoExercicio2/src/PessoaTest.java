public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Danilo", 30);

        for (int i = 0;i<=9;i++) {
            p1.fazAniversario();
        }

        p1.imprimirDados();
    }

}
