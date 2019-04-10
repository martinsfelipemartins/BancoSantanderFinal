package br.com.exerciciosantander;

import java.util.Date;

public class Cheque {

    private double valor;
    private String bancoEmissor;
    private Date dataPagamento;

    public double getValor() {
        return valor;
    }

    public void setValor(double novoValor) {
        valor = novoValor;
    }

    public String getBancoEmissor() {
        return bancoEmissor;
    }

    public void setBancoEmissor(String novoBancoEmissor) {
        bancoEmissor = novoBancoEmissor;
    }

    public Date getDataPagamento() {
        return dataPagamento;
    }

    public void setDataPagamento(Date novoDataPagamento) {
        dataPagamento = novoDataPagamento;
    }
}
