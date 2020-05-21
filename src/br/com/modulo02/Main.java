package br.com.modulo02;

import br.com.modulo02.aluno.Aluno;
import br.com.modulo02.aluno.ValidationException;
import br.com.modulo02.disciplinas.Disciplina;
import br.com.modulo02.disciplinas.LimiteAlunosAlcancadoException;
import br.com.modulo02.professor.Professor;
import br.com.modulo02.usuarios.RepositorioUsuario;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        try {
            Professor professor = new Professor("Testeprof", "Teste", "999.222.222-11");
            RepositorioUsuario repoUser = new RepositorioUsuario();
            repoUser.salvar(new Aluno("Marcellologin", "Marcello", "000.000.000-11"));
            repoUser.salvar(professor);
            Disciplina disciplina = new Disciplina("Matematica", professor);
            repoUser.findAll().stream().forEach(usuario -> System.out.println(usuario.getNome()));
            for(int i=0; i< 3; i++) {
                disciplina.matricular( new Aluno("Marcellologin", "Marcello", "000.000.000-11"));
            }
            System.out.println("=========================");
            System.out.println("Alunos matriculados na disciplina");
            System.out.println("=========================");
            disciplina.exibirAlunosMatriculados();
            System.out.println("=========================");
            System.out.println("Search");
            System.out.println(repoUser.search("000.000.000-11"));
        } catch (ValidationException | LimiteAlunosAlcancadoException e) {
            e.printStackTrace();
        }

    }
}
