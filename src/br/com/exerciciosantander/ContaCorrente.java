package br.com.exerciciosantander;

public class ContaCorrente extends Conta {

    private float limiteChequeEspecial;


    public float getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(float novoLimiteChequeEspecial) {
        limiteChequeEspecial = novoLimiteChequeEspecial;
    }

    @Override
    public void sacarDinheiro(float quantia) {
        System.out.println("Realizando Saque de: " + quantia);
        if (quantia > getSaldo()) {
            System.out.println("Saldo insuficiente. Fazendo saque do Cheque Especial de: "+ quantia);
            setLimiteChequeEspecial(getLimiteChequeEspecial()-quantia);

            System.out.println("Seu limite especial agora é: "+ getLimiteChequeEspecial());
        }
    }

    public void depositarCheque(Cheque cheque) {
        System.out.println("Cheque depositado no valor de R$ " + cheque.getValor());
        setSaldo((float) (getSaldo() + cheque.getValor()));
        System.out.println("Seu novo saldo é: " + getSaldo());

    }
}
