package br.com.modulo02.aluno;

public class Aluno {

    private String login;
    private String nome;
    private String cpf;

    public Aluno(String login, String nome, String cpf) {
        this.nome = nome;
        if(validateLogin(login)) {
            this.login = login;
        } else {
            System.out.println("login inválido");
        }
        this.cpf = cpf;
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
    public void imprimirDados() {
        System.out.println("login: "+ login + " Nome: "+ nome + " CPF: "+cpf);
    }
}
