package br.com.modulo02.disciplinas;

import br.com.modulo02.aluno.Aluno;
import br.com.modulo02.professor.Professor;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private List<Aluno> alunos = new ArrayList<>();
    private Professor professor;
    private final Integer LIMITE = 12;

    public Disciplina(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public void matricular(Aluno aluno) throws LimiteAlunosAlcancadoException{
        if(this.alunos.size() < LIMITE) {
            this.alunos.add(aluno);
        } else {
            throw new LimiteAlunosAlcancadoException("Turma cheia");
        }
    }

    public void exibirAlunosMatriculados() {
       this.alunos.forEach(aluno -> {
           System.out.println("Aluno Matriculado: " + aluno.getNome());
       });

    }
}
