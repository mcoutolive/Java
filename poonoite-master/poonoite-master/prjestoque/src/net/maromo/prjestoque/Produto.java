package net.maromo.prjestoque;

public class Produto {
    //Atributos
    private int codigo;
    private String nome;
    private int qtdEstoque;
    private double valorProduto;

    //Construtor
    public Produto(int codigo, String nome, double valorProduto){
        this.codigo = codigo;
        this.nome = nome;
        this.valorProduto = valorProduto;
    }

    //gets and sets (modificadores de acesso)
    //alt + insert
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getQtdEstoque() {
        return qtdEstoque;
    }
    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
    public double getValorProduto() {
        return valorProduto;
    }
    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    //Métodos comprar e vender
    public boolean vender(int qtd){
        if(this.qtdEstoque >= qtd){
            this.qtdEstoque -= qtd;
            return true;
        }
        return false;
    }

    public boolean comprar(int qtd){
        this.qtdEstoque += qtd;
        return true;
    }


}
