package br.com.modulo02;

import br.com.modulo02.aluno.ValidationException;

public class Usuario {
    private String login;
    private String cpf;
    private String nome;

    public Usuario(String login, String nome, String cpf) throws ValidationException {
        this.nome = nome;
        if(validateLogin(login)) {
            this.login = login;
        } else {
            throw new ValidationException("login inválido");
        }
        if(validateCpf(cpf)) {
            this.cpf = cpf;
        } else {
            throw new ValidationException("cpf inválido");
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private boolean validateLogin(String login) {
        return login != null && !login.isEmpty() && login.length() < 20 && login.contains(nome);
    }

    private boolean validateCpf(String cpf) {
        return cpf.length() == 14;
    }

    @Override
    public String toString() {
        return this.nome;
    }
}
