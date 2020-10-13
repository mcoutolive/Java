package net.maromo.prjcontabancaria;

import java.time.LocalDate;

/**
 * @author Maromo
 * @since 2020 Sept
 * @version 0.1 Beta
 */
public class Conta {
    //atributos não estáticos
    public int numero;
    public String cliente;
    public double saldo;
    public LocalDate dataAbertura;
    public static double cpmf; //Compartilhado entre todos os membros desta classe

    /**
     *
     * @param valor Valor referente ao debito a ser efetuado na conta corrente
     *
     */
    public void debitarConta(double valor){
        if(valor <= saldo){
            double vlrDesconto = valor * cpmf;
            this.saldo -= (valor + vlrDesconto);
        }
    }

    /**
     *
     * @param valor Valor referente ao deposito em conta corrente
     */
    public void depositarConta(double valor){
        this.saldo += valor;
    }


}
