package br.com.modulo02;

import br.com.modulo02.aluno.Aluno;
import br.com.modulo02.aluno.ValidationException;

public class Main {

    public static void main(String[] args) {
        try {
            Aluno aluno = new Aluno("Marcellologin", "Maarcello", "000.000.000-11");
            aluno.imprimirDados();
        } catch (ValidationException e) {
            e.printStackTrace();
        }

    }
}
