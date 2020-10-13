package net.maromo.prjcomputador;

public class ComputadorTeste {

    public static void main(String[] args) {
        Computador comp1 = new Computador();
        comp1.setNumeroSerie(1);
        comp1.setModelo("XS");
        comp1.setMarca("IbM");
        comp1.setPreco(3000.0);
        comp1.setCor("Preta");

        comp1.imprimir();

        comp1.calcularValor();

        comp1.imprimir();

        Computador comp2 = new Computador();
        comp2.setNumeroSerie(2);
        comp2.setModelo("Novo");
        comp2.setCor("Prata");
        comp2.setMarca("Hp");
        comp2.setPreco(2000.0);

        comp2.imprimir();

        comp2.calcularValor();

        comp2.imprimir();

        if(comp2.alterarValor(500)==1){
            System.out.println("Preco alterado com sucesso");
        }else{
            System.out.println("Preco invalido, não alterado");
        }
        System.out.println(comp2.getPreco());

    }
}
