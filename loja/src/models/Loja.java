package models;

import java.lang.ref.Cleaner;

public class Loja {

    private Produto[] produtos;
    private Cliente[] clientes;

    public Loja() {
        this.produtos = new Produto[10];
        this.clientes = new Cliente[10];
    }

    public Produto[] getProdutos() {
        return produtos;
    }

    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

    public Cliente[] getClientes() {
        return clientes;
    }

    public void setClientes(Cliente[] clientes) {
        this.clientes = clientes;
    }

    public boolean addPoduto(Produto produto){
        for (int i = 0; i<produtos.length; i++){
            if(produtos[i] == null){
                produtos[i] = produto;
                return true;
            }
        }
        return false;
    }

    public boolean addCliente(Cliente cliente){
        for (int i = 0; i<clientes.length; i++){
            if (clientes[i]==null){
                clientes[i] = cliente;
                return true;
            }
        }
        return false;
    }

//    public Produto remProduto(int codigo){
      public boolean remProduto(int codigo){
        for (int i = 0; i<produtos.length; i++) {
            if (produtos[i].getCodigo() == codigo) {
//                Produto produto = produtos[i];
                produtos[i] = null;
//                return produto;
                return true;
            }
        }
        return false;
    }
}
