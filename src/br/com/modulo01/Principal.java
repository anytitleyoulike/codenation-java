package br.com.modulo01;

import br.com.modulo01.tarefas.Tarefa;
import br.com.modulo01.tarefas.ListaTarefas;

public class Principal {

    public static void main(String[] args) {
//       Tarefa tarefa1 = new Tarefa("Regar as plantas");
//       Tarefa tarefa2 = new Tarefa("Varrer a casa");
//       Tarefa tarefa3 = new Tarefa("lavar a louça");

//       tarefa1.exibirTarefa();
//       System.out.println("A tarefa tem: "+ tarefa1.obterTamanhoTarefa() + " caracteres");

//        ArrayTarefas tarefas = new ArrayTarefas(3);
//
//        tarefas.adicionaTarefa(tarefa1);
//        tarefas.adicionaTarefa(tarefa2);
//        tarefas.adicionaTarefa(tarefa3);

        System.out.println("Minhas tarefas");
        System.out.println("----------------------");
        ListaTarefas listaTarefas = new ListaTarefas();
        listaTarefas.adicionarTarefa("Regar as plantas");
        listaTarefas.adicionarTarefa("Varrer a casa");
        listaTarefas.adicionarTarefa("limpar o banheiro");

        listaTarefas.exibirTarefas();
        System.out.println("----------------------");
        System.out.println("Remove uma tarefa");
        listaTarefas.removerTarefa(4);
        listaTarefas.exibirTarefas();

        System.out.println("----------------------");
        System.out.println("Busca uma tarefa");
        listaTarefas.buscarTarefa("varrer");

    }
}
