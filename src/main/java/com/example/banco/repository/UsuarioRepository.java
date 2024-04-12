package com.example.banco.repository;

import com.example.banco.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByCpf(String cpf);
    // Métodos personalizados de consulta podem ser adicionados aqui, se necessário
}