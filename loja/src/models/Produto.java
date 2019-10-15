package models;

public class Produto {

    private long codigo;
    private String descricao;
    private float valor;
    private float valorPontos;
    private boolean promocao;

    public Produto(long codigo, String descricao, float valor, float valorPontos, boolean promocao) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.valorPontos = valorPontos;
        this.promocao = promocao;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
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

    public float getValorPontos() {
        return valorPontos;
    }

    public void setValorPontos(float valorPontos) {
        this.valorPontos = valorPontos;
    }

    public boolean isPromocao() {
        return promocao;
    }

    public void setPromocao(boolean promocao) {
        this.promocao = promocao;
    }
    
}
