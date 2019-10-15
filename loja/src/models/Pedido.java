package models;

import java.lang.reflect.Array;
import java.time.LocalDate;

public class Pedido  {

    private Cliente cliente;
    private LocalDate data;
    private Array produtos;

    public Pedido(Cliente cliente, LocalDate data, Array produtos) {
        this.cliente = cliente;
        this.data = data;
        this.produtos = produtos;
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

    public Array getProdutos() {
        return produtos;
    }

    public void setProdutos(Array produtos) {
        this.produtos = produtos;
    }
}
