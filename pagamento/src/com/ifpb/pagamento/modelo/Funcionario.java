package com.ifpb.pagamento.modelo;

import java.time.LocalDate;

public abstract class Funcionario {

    private String cpf;
    private String nome;
    private float salario;
    private LocalDate nascimento;

    public Funcionario(String cpf, String nome, float salario, LocalDate nascimento){
        this.cpf = cpf;
        this.nome = nome;
        this.salario = salario;
        this.nascimento = nascimento;
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
