package com.ifpb.pagamento.modelo;

public class Tecnico extends Funcionario {

    private String setor;
    private int horasExtras;

    public Tecnico(String cpf, String nome, float salario, String setor, int horasExtras){
        super(cpf, nome, salario);
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
