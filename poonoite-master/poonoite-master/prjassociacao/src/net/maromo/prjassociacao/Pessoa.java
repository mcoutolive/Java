package net.maromo.prjassociacao;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String nome;
    private String cidade;
    private String uf;
    private double salario;
    private List<Carro> listaDeCarros = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<Carro> getListaDeCarros() {
        return listaDeCarros;
    }

    public void setListaDeCarros(List<Carro> listaDeCarros) {
        this.listaDeCarros = listaDeCarros;
    }

    public void adicionarCarro(Carro carro){
        listaDeCarros.add(carro);
    }

    public void imprimir(){
        System.out.println("DADOS PESSOAIS");
        System.out.println("nome = " + nome);
        System.out.println("cidade = " + cidade);
        System.out.println("uf = " + uf);
        System.out.println("salario = " + salario);
        System.out.println("-----------------------------");
        if(listaDeCarros.size()>0){
            for (int i = 0; i < listaDeCarros.size(); i++) {
                listaDeCarros.get(i).imprimir();
            }
        }
    }
}
