package br.com.modulo01.tarefas;

import java.util.ArrayList;

public class ListaTarefas {
    ArrayList<Tarefa> tarefas = new ArrayList<>();

    public void adicionarTarefa(Tarefa tarefa) {
        if(tarefa != null && tarefa.obterTamanhoTarefa() < 20) {
            this.tarefas.add(tarefa);
        } else {
            System.out.println("A tarefa é inválida");
        }

    }

    public void adicionarTarefa(String descricao) {
        Tarefa tarefa = new Tarefa(descricao);
        adicionarTarefa(tarefa);
    }


    public void removerTarefa(Tarefa tarefa) {
        this.tarefas.remove(tarefa);
    }

    public void removerTarefa(int posicao) {
        if(posicao < this.tarefas.size()) {
            this.tarefas.remove(posicao);
        } else {
            System.out.println("Essa tarefa não existe");
        }
    }

    public Tarefa buscarTarefa(String descricao) {
        for(Tarefa t : tarefas) {
            if(descricao.equals(t.descricao)) {
                return t;
            }
        }
        System.out.println("tarefa nao encontrada");
        return null;
    }


    public void exibirTarefas() {
        for(Tarefa tarefa: tarefas) {
            tarefa.exibirTarefa();
        }
    }
}

