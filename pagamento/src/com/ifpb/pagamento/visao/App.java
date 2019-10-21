package com.ifpb.pagamento.visao;

import com.ifpb.pagamento.modelo.Funcionario;
import com.ifpb.pagamento.modelo.Professor;
import com.ifpb.pagamento.modelo.Tecnico;

import java.time.LocalDate;

public class App {

    public static void main(String[] args){

        Funcionario professor = new Professor("705.207.724-82", "Ricart",
                20000, LocalDate.of(2000, 01, 14), "Estrutura de Dados", 40);

        Funcionario tecnico = new Tecnico("118.568.957-78", "Gabriel",
                6000, LocalDate.of(2001, 07, 31), "CTI", 23);

        System.out.println(professor.calcularPagamento());
        System.out.println(tecnico.calcularPagamento());
    }

}
