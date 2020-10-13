package net.maromo;

public class Main {

    public static void main(String[] args) {
	    Pessoa menina = new Pessoa();
	    menina.setId(1);
	    menina.setNome("Marina");
	    menina.setSexo(Sexo.feminino);
        System.out.println(menina.toString());
    }
}
