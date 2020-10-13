package net.maromo.prjcomputador;

public class Computador {
    private String marca;
    private String cor;
    private String modelo;
    private long numeroSerie;
    private double preco;

    //gerar getters and setters

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public long getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(long numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void imprimir(){
        System.out.println("marca = " + marca);
        System.out.println("cor = " + cor);
        System.out.println("modelo = " + modelo);
        System.out.println("numeroSerie = " + numeroSerie);
        System.out.println("preco = " + preco);
    }

    public void calcularValor(){
        //se marca for hp aumenta 30%, se for ibm 50%.
        if(marca.equalsIgnoreCase("HP")){
            preco *= 1.30;
        }
        if(marca.equalsIgnoreCase("IBM")){
            preco *= 1.50;
        }
    }


    public int alterarValor(double preco){
        if(preco > 0){
            this.preco = preco;
            return 1;
        }
        return 0;
    }
}
