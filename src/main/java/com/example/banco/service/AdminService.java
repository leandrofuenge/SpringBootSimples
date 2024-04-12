package com.example.banco.service;

import com.example.banco.entity.Usuario;
import com.example.banco.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminService {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public AdminService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public Usuario criarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> obterTodosUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario obterUsuarioPorCpf(String cpf) {
        Optional<Usuario> optionalUsuario = usuarioRepository.findByCpf(cpf);
        return optionalUsuario.orElse(null);
    }

    public Usuario modificarUsuarioPorCpf(String cpf, Usuario usuario) {
        Usuario usuarioExistente = obterUsuarioPorCpf(cpf);
        if (usuarioExistente != null) {
            usuarioExistente.setNomeCompleto(usuario.getNomeCompleto());
            usuarioExistente.setEmail(usuario.getEmail());
            // Continue atualizando outros campos conforme necessário
            return usuarioRepository.save(usuarioExistente);
        } else {
            return null;
        }
    }

    public boolean excluirUsuarioPorCpf(String cpf) {
        Optional<Usuario> optionalUsuario = usuarioRepository.findByCpf(cpf);
        if (optionalUsuario.isPresent()) {
            usuarioRepository.delete(optionalUsuario.get());
            return true;
        } else {
            return false;
        }
    }
}
