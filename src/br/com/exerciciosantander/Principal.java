package br.com.exerciciosantander;

import java.util.Date;

public class Principal {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setCpf("92981829812");
        cliente.setNome("Tairo");
        cliente.setRG("9834980348");


        Cheque cheque= new Cheque();
        cheque.setBancoEmissor("Itau");
        cheque.setDataPagamento( new Date());
        cheque.setValor(50.0d);


        /*ContaPoupanca poupanca= new ContaPoupanca();
        poupanca.setSaldo(100.0f);
        poupanca.setTaxa(0.08f);
        poupanca.setCliente(cliente);

        poupanca.fazerDepositos(60);
        poupanca.sacarDinheiro(150);
        poupanca.recolherJuros();*/


        ContaCorrente corrente=new ContaCorrente();
        corrente.setSaldo(200);
        corrente.setLimiteChequeEspecial(1000);
        corrente.setCliente(cliente);

        corrente.sacarDinheiro(700);
        corrente.depositarCheque(cheque);
        corrente.consultarSaldo();



    }
}
