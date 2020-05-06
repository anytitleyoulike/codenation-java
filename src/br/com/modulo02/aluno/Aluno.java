package br.com.modulo02.aluno;

import java.io.IOException;

public class Aluno {

    private String login;
    private String nome;
    private String cpf;

    public Aluno(String login, String nome, String cpf) throws ValidationException {
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
        if(this.validateLogin(login)) {
            this.login = login;
        }
        System.out.println("login inválido");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private boolean validateLogin(String login) {
        return login != null && !login.isEmpty() && login.length() < 20 && login.contains(nome);
    }

    private boolean validateCpf(String cpf) {
        return cpf.length() == 14;
    }

    public void imprimirDados() {
        System.out.println("login: "+ login + " Nome: "+ nome + " CPF: "+cpf);
    }
}
