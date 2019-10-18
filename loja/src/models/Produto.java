package models;

public class Produto {

    private int codigo;
    private String descricao;
    private float valor;
    private int valorPontos;
    private boolean promocao;

    public Produto(int codigo, String descricao, float valor, int valorPontos, boolean promocao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.valorPontos = valorPontos;
        this.promocao = promocao;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getValorPontos() {
        return valorPontos;
    }

    public void setValorPontos(int valorPontos) {
        this.valorPontos = valorPontos;
    }

    public boolean isPromocao() {
        return promocao;
    }

    public void setPromocao(boolean promocao) {
        this.promocao = promocao;
    }

}
