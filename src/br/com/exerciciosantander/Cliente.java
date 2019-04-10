package br.com.exerciciosantander;

public class Cliente {

    private String nome;
    private String sobrenome;
    private String RG;
    private String cpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String novoNome) {
        nome = novoNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String novoSobrenome) {
        sobrenome = novoSobrenome;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String novoRG) {
        RG = novoRG;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String novoCpf) {
        cpf = novoCpf;
    }
}
