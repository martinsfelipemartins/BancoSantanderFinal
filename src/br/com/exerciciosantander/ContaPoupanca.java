package br.com.exerciciosantander;

public class ContaPoupanca extends Conta {

    private float taxa;

    public float getTaxa() {
        return taxa;
    }

    public void setTaxa(float novoTaxa) {
        taxa = novoTaxa;
    }

    public void recolherJuros() {
        System.out.println("Seu juros é: " + ((taxa / 100) * getSaldo()));

    }

//alt enter

    @Override
    public void sacarDinheiro(float quantia) {

        System.out.println("Sacando dinheiro: " + quantia);
        if (getSaldo() >= quantia) {
            setSaldo(getSaldo() - quantia);
        }
        System.out.println("Seu novo saldo é: " + getSaldo());
    }
}

