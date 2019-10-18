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
    
}
