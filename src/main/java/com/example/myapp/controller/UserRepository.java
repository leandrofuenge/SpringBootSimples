package com.example.myapp.controller;

import com.example.myapp.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Usuario, Long> {
    // Encontrar usuário por CPF
    Usuario findByCpf(String cpf);

    // Outros métodos CRUD já são fornecidos pelo JpaRepository
}
