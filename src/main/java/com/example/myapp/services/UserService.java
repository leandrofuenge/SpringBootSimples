package com.example.myapp.services;

import com.example.myapp.controller.UserRepository;
import com.example.myapp.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;


    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * Adiciona um novo usuário.
     *
     * @param usuario O usuário a ser adicionado.
     * @return O usuário adicionado.
     */
    public Usuario adicionarUsuario(Usuario usuario) {
        return userRepository.save(usuario);
    }

    /**
     * Exclui um usuário pelo ID.
     *
     * @param id O ID do usuário a ser excluído.
     * @return true se o usuário foi excluído com sucesso, false caso contrário.
     */
    public boolean excluirUsuario(Long id) {
        try {
            userRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * Atualiza as informações de um usuário.
     *
     * @param id       O ID do usuário a ser atualizado.
     * @param usuario  O objeto contendo as informações atualizadas do usuário.
     * @return O usuário atualizado.
     */
    public Usuario atualizarUsuario(Long id, Usuario usuario) {
        usuario.setId(id);
        return userRepository.save(usuario);
    }

    /**
     * Retorna as informações de um usuário pelo ID.
     *
     * @param id O ID do usuário.
     * @return O usuário encontrado, ou null se não encontrado.
     */
    public Usuario lerUsuario(Long id) {
        Optional<Usuario> optionalUsuario = userRepository.findById(id);
        return optionalUsuario.orElse(null);
    }

    /**
     * Lista todos os usuários cadastrados.
     *
     * @return A lista de usuários.
     */
    public List<Usuario> listarUsuarios() {
        return userRepository.findAll();
    }
}
