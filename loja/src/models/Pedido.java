package models;

import java.time.LocalDate;

public class Pedido  {

    private Cliente cliente;
    private LocalDate data;
    private ItemPedido[] produtos;

    public Pedido(Cliente cliente, LocalDate data) {
        this.cliente = cliente;
        this.data = data;
        this.produtos = new ItemPedido[10];
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    //Métodos adicionais

    public boolean addProduto(ItemPedido produto){
        for(int i = 0; i < this.produtos.length; i++){
            if(this.produtos[i] == null){
                this.produtos[i] = produto;
                return true;
            }
        }
        return false;
    }

    public boolean remProduto(int codigo){
        for (int i = 0; i < produtos.length; i++){
            if (codigo==produtos[i].getProduto().getCodigo()){
                produtos[i] = null;
                return true;
            }
        }
        return false;
    }

    public void remTodos(){
        for (int i = 0; i < produtos.length; i++) {
            produtos[i] = null;
        }
    }

    public float getTotal() {
        float soma = 0;
        for (int i = 0; i < produtos.length; i++) {
            soma += produtos[i].getSubtotal();
        }
        return soma;
    }

}
