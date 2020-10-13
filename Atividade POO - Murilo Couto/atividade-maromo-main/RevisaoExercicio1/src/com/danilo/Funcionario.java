package com.danilo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Funcionario {
    private Integer idFunc;
    private String nomeFunc;
    private String departamento;
    private LocalDate dataContratacao;
    private Double salario;
    private String documento;
    private Boolean ativo;


    public Funcionario(){
        setAtivo(true);
    }

    public Funcionario(Integer idFunc, String nomeFunc, String departamento, LocalDate dataContratacao, Double salario, String documento, Boolean ativo) {
        this.idFunc = idFunc;
        this.nomeFunc = nomeFunc;
        this.departamento = departamento;
        this.dataContratacao = dataContratacao;
        this.salario = salario;
        this.documento = documento;
        setAtivo(true);
    }

    public void atualizarSalario(Double aumento){
        if (aumento > 0) {
            setSalario(getSalario() + aumento);
            System.out.println("Aumento atualizado com sucesso.");
        } else {
            System.out.println("Aumento deve ter um valor positivo.");
        }
    }

    public void demiteFuncionario(){
        setAtivo(false);
        System.out.println("O funcionario esta demitido.");
    }

    public void imprimir(){
        System.out.println(getIdFunc());
        System.out.println(getNomeFunc());
        System.out.println(getDepartamento());
        System.out.println(getDataContratacao());
        System.out.println(getSalario());
        System.out.println(getDocumento());
        System.out.println(getAtivo());
    }

    public Integer getIdFunc() {
        return idFunc;
    }

    public void setIdFunc(Integer idFunc) {
        this.idFunc = idFunc;
    }

    public String getNomeFunc() {
        return nomeFunc;
    }

    public void setNomeFunc(String nomeFunc) {
        this.nomeFunc = nomeFunc;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public LocalDate getDataContratacao() {
        return dataContratacao;
    }

    public void setDataContratacao(String dataContratacao) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate localDate = LocalDate.parse(dataContratacao, formatter);
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
