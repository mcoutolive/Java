package net.maromo.prjapolice;

public class ApoliceTeste {

    public static void main(String[] args) {
	// write your code here
        int x = 10;
        Apolice apolice = new Apolice();
        apolice.setNomeSegurado("Carlos Roberto Santos");
        apolice.setIdade(34);
        apolice.setValorPremio(3500.0f);

        apolice.imprimir();
    }
}
