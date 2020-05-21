package br.com.modulo02.usuarios;

import br.com.modulo02.Usuario;

import java.util.ArrayList;
import java.util.List;

public class RepositorioUsuario {
    List<Usuario> usuarios = new ArrayList<>();

    public void salvar(Usuario usuario) {
        this.usuarios.add(usuario);
    }

    public void delete(Usuario usuario) {
        this.usuarios.remove(usuario);
    }

    public Usuario search(String cpf) {
        for(Usuario user: usuarios){
            if(user.getCpf().equals(cpf)){
                return user;
            }
        }

        return null;
    }

    public List<Usuario> findAll() {
        return this.usuarios;
    }
}
