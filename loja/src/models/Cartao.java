package models;

import models.Produto;

public class Cartao {

    private float pontos;
    private String tipo;
    private float acumulo;
    private float desconto;

    public Cartao(String tipo, float acumulo, float desconto){

        this.pontos = 0;
        this.tipo = tipo;
        this.acumulo = acumulo;
        this.desconto = desconto;

    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float consultaSaldo() {
        return pontos;
    }

    public float acumulaPontos(float compra){
        int real = (int) compra;
        float acumulada = acumulo*real;
        pontos += acumulada;
        return acumulada;
    }

    public float trocaPontos(Produto produto){
        float custo = produto.getValorPontos();
        if (pontos >= custo){
            if (produto.isPromocao()){
                custo *= desconto;
            }
            pontos -= custo;
            return custo;
        }
        return 0;
    }

}
