package net.maromo;

public class Main {

    public static void alterar(Carro x){
        x.setId(1);
        x.setModelo("147");
        x.setMarca("Fiat");
    }
    public static void main(String[] args) {
	    Carro y = new Carro();
	    y.setId(2);
	    y.setModelo("Frontier");
	    y.setMarca("Nissan");

        Carro z = new Carro();
        z.setId(3);
        z.setMarca("ford");
        z.setModelo("ka");

        Carro h = z;
        h.setId(4);
        h.setMarca("Volkswagen");
        h.setModelo("Fusca");

        System.out.println(h);
        System.out.println(z);
        y = z;
        System.out.println(y);


    }
}
