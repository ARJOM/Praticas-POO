package models;

public class Cartao {

    private float pontos;
    private String tipo;

    public Cartao(String tipo){

        this.pontos = 0;
        this.tipo = tipo;

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
        int real = Integer.parseInt(compra)
        if (tipo == "azul"){
            pontos += 1.5*real;
            return  1.5*real;
        } else if (tipo == "branco"){
            pontos += real;
            return real;
        }
        return 0;
    }

    public float trocaPontos(Produto produto){
        float custo = produto.getValorPontos();
        if (pontos >= custo){
            if (produto.emPromocao()){
                if (tipo == "branco"){
                    custo *= 0.95;
                } else if (tipo == "azul"){
                    custo *= 0.9;
                }
            }
            pontos -= custo;
            return custo
        }
        return 0;
    }

}
