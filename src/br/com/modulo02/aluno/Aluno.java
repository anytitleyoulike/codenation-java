package br.com.modulo02.aluno;

import br.com.modulo02.Usuario;

import java.io.IOException;

public class Aluno extends Usuario {
    private Integer numeroMatricula;
    public Aluno(String login, String nome, String cpf) throws ValidationException {
        super(login, nome, cpf);

    }
}
