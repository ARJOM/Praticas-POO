package models;

import java.lang.ref.Cleaner;
import java.util.Arrays;

public class Loja {

    private Produto[] produtos;
    private int quantidadeProdutos;
    private Cliente[] clientes;
    private int quantidadeCLientes;

    public Loja() {
        produtos = new Produto[10];
        quantidadeProdutos = 0;
        clientes = new Cliente[10];
        quantidadeCLientes = 0;
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
        if (quantidadeProdutos == produtos.length){
            produtos = Arrays.copyOf(produtos, produtos.length+10);
        }
        if(getProduto(produto.getCodigo())!=null){
            return false;
        } else {
            produtos[quantidadeProdutos++] = produto;
            return true;
        }
    }

    public boolean addCliente(Cliente cliente){
        if (quantidadeCLientes == clientes.length){
            clientes = Arrays.copyOf(clientes, clientes.length+10);
        }
        if(getCliente(cliente.getCpf())!=null) {
            return false;
        } else{
            clientes[quantidadeCLientes++] = cliente;
            return true;
        }
    }

    public boolean remProduto(int codigo){
        for (int i = 0; i<quantidadeProdutos; i++) {
            if (produtos[i].getCodigo() == codigo) {
                for (int j=i; j<quantidadeProdutos-1; j++){
                    produtos[j] = produtos[j+1];
                }
                quantidadeProdutos--;
                return true;
            }
        }
        return false;
    }

    public boolean remCliente(String cpf){
        for (int i = 0; i<quantidadeCLientes; i++){
            if(clientes[i].getCpf().equals(cpf)){
                for (int j=i; j<quantidadeCLientes-1; j++){
                    clientes[j] = clientes[j+1];
                }
                quantidadeCLientes--;
                return true;
            }
        }
        return false;
    }

    public Produto getProduto(int codigo) {
        for (int i = 0; i<quantidadeProdutos; i++){
            if (produtos[i].getCodigo() == codigo){
                return produtos[i];
            }
        }
        return null;
    }

    public Cliente getCliente(String cpf) {
        for (int i = 0; i<quantidadeCLientes; i++){
            if (clientes[i].getCpf().equals(cpf)){
                return clientes[i];
            }
        }
        return null;
    }

}
