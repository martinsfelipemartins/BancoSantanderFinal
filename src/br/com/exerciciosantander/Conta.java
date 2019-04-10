package br.com.exerciciosantander;

public abstract class Conta {

    private Cliente cliente;
    private float saldo;


    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float novoSaldo) {
        saldo = novoSaldo;
    }

    public void fazerDepositos(float quantia) {
        System.out.println("Realizando deposito: "+ quantia);
        saldo = saldo + quantia;

        System.out.println("Seu novo saldo é: "+ saldo);
    }

    public abstract void sacarDinheiro(float quantia);

    public void consultarSaldo() {
        System.out.println("O saldo atual é: " + getSaldo());
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente novoCliente) {
        cliente = novoCliente;
    }
}
