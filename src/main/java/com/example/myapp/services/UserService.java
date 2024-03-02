package com.example.myapp.services;

import com.example.myapp.model.UsuarioDAO;
import com.example.myapp.repository.UserRepository; // Importe o UserRepository
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UsuarioDAO adicionarUsuario(UsuarioDAO usuarioDAO) {
        return userRepository.save(usuarioDAO);
    }

    public boolean excluirUsuario(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
            return true;
        }
        return false;
    }

    public UsuarioDAO atualizarUsuario(Long id, UsuarioDAO usuarioDAO) {
        return userRepository.findById(id)
                .map(existingUser -> {
                    usuarioDAO.setId(id);
                    return userRepository.save(usuarioDAO);
                })
                .orElse(null);
    }

    public UsuarioDAO lerUsuario(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Usuário não encontrado"));
    }

    public List<UsuarioDAO> listarUsuarios() {
        return userRepository.findAll();
    }
}
