package br.com.modulo02.professor;

import br.com.modulo02.Usuario;
import br.com.modulo02.aluno.ValidationException;

public class Professor extends Usuario {
    private Integer numeroMatricula;

    public Professor(String login, String nome, String cpf) throws ValidationException {
        super(login, nome, cpf);
    }
}
