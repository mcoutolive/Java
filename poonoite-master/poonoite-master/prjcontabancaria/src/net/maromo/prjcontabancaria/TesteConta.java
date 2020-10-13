package net.maromo.prjcontabancaria;

public class TesteConta {

    public static void main(String[] args) {
	    Conta conta1, conta2;
	    Conta.cpmf = 0.01; //Usa a classe como forma de acessar o campo ou atributo
	    conta1 = new Conta();
	    conta1.cliente = "Osmar";
	    conta1.numero = 1;
	    conta1.depositarConta(1000);
	    conta1.debitarConta(100);
        System.out.println("Saldo da Conta: " + conta1.saldo);

        conta2 = new Conta();
        conta2.numero = 2;
        conta2.cliente = "Jose";
        conta2.depositarConta(500);
        conta2.debitarConta(100);
		System.out.println("Saldo da conta 2: " + conta2.saldo);

	}
}
