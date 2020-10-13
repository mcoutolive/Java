package net.maromo.prjassociacao;

public class Carro {
    private int numCarro;
    private String marca;
    private String modelo;
    private double preco;

    public int getNumCarro() {
        return numCarro;
    }

    public void setNumCarro(int numCarro) {
        this.numCarro = numCarro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void imprimir(){
        System.out.println("Dados do Carro");
        System.out.println("numCarro = " + numCarro);
        System.out.println("marca = " + marca);
        System.out.println("modelo = " + modelo);
        System.out.println("preco = " + preco);
        System.out.println("------------------");
    }
}
