package com.ifpb.pagamento.modelo;

public abstract class Funcionario {

    private String cpf;
    private String nome;
    private float salario;

    public Funcionario(String cpf, String nome, float salario){
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    //Método abstrato
    public abstract float calcularPagamento();

}
