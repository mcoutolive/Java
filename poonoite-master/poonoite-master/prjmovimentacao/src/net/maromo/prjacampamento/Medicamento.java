package net.maromo.prjacampamento;

import java.time.LocalDate;

public class Medicamento {
    private long id;
    private String medicamento;
    private String concentracao;
    private String forma;
    private String numRegistro;
    private double preco;
    private LocalDate dataCadastro;
    private Farmaceutica detentora;

    //getters and setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public String getConcentracao() {
        return concentracao;
    }

    public void setConcentracao(String concentracao) {
        this.concentracao = concentracao;
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        this.forma = forma;
    }

    public String getNumRegistro() {
        return numRegistro;
    }

    public void setNumRegistro(String numRegistro) {
        this.numRegistro = numRegistro;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public LocalDate getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDate dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Farmaceutica getDetentora() {
        return detentora;
    }

    public void setDetentora(Farmaceutica detentora) {
        this.detentora = detentora;
    }

    public void imprimir(){
        System.out.println("id = " + id);
        System.out.println("medicamento = " + medicamento);
        System.out.println("concentracao = " + concentracao);
        System.out.println("forma = " + forma);
        System.out.println("numRegistro = " + numRegistro);
        System.out.printf("preco %.2f \n", preco);
        System.out.println("dataCadastro = " + dataCadastro);
        System.out.println("-------------------------------");
        System.out.println("Dados do laboratório: ");
        this.getDetentora().imprimir();
    }

    public void alterarPreco(){
        //aumentar o preco em 10 %
        this.preco *= 1.10;
    }

    public void registrarData(){
        dataCadastro = LocalDate.now();
    }
}

