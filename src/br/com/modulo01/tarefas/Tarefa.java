package br.com.modulo01.tarefas;

public class Tarefa {
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }
    public String descricao;

    public void exibirTarefa() {
        System.out.println(descricao);
    }

    public int obterTamanhoTarefa(){
        return this.descricao.length();
    }
}
