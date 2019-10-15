package models;

public class Cliente {

    private String nome;
    private String cpf;
    private Cartao cartao;

    public Cliente(String nome, String cpf, Cartao cartao) {
        this.nome = nome;
        this.cpf = cpf;
        this.cartao = cartao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }
}
