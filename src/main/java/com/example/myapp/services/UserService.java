package com.example.myapp.services;

import com.example.myapp.controller.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myapp.model.Usuario;


import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService (UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Adicionar um novo usuário
    public Usuario adicionarUsuario(Usuario usuario) {
        return userRepository.save(usuario);
    }

    // Excluir um usuário
    public void excluirUsuario(Long id) {
        userRepository.deleteById(id);
    }

    // Atualizar informações de um usuário
    public Usuario atualizarUsuario(Long id, Usuario usuario) {
        usuario.setId(id); // Garante que o ID passado seja o mesmo do usuário a ser atualizado
        return userRepository.save(usuario);
    }
 
    // Ler informações de um usuário específico
    public Usuario lerUsuario(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    // Listar todos os usuários
    public List<Usuario> listarUsuarios() {
        return userRepository.findAll();
    }
}
