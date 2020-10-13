package net.maromo.prjassociacao;

public class Main {

    public static void main(String[] args) {
	    //Criando o objeto Carlos
        Pessoa pessoa = new Pessoa();
	    pessoa.setNome("Carlos");
	    pessoa.setCidade("Mogi Mirim");
        pessoa.setUf("SP");
	    pessoa.setSalario(3000.0);

	    //Criando dois carros
        Carro carro1 = new Carro();
        carro1.setMarca("Fiat");
        carro1.setModelo("147");
        carro1.setNumCarro(1);
        carro1.setPreco(1000.0);

        Carro carro2 = new Carro();
        carro2.setMarca("Chevrolet");
        carro2.setModelo("Camaro");
        carro2.setNumCarro(2);
        carro2.setPreco(100000.0);

        pessoa.adicionarCarro(carro1);
        pessoa.adicionarCarro(carro2);

        //imprimir os dados do Carlos
        pessoa.imprimir();
   
    }
}
