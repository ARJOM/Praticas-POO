package com.ifpb.pagamento.modelo;

import java.time.LocalDate;

public class Tecnico extends Funcionario {

    private String setor;
    private int horasExtras;

    public Tecnico(String cpf, String nome, float salario, LocalDate nascimento, String setor, int horasExtras){
        super(cpf, nome, salario, nascimento);
        this.setor = setor;
        this.horasExtras = horasExtras;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getHorasExtras() {
        return horasExtras;
    }

    public void setHorasExtras(int horasExtras) {
        this.horasExtras = horasExtras;
    }

    @Override
    public float calcularPagamento(){
        return getSalario() + (20 * horasExtras);
    }
}
