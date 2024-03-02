package com.example.myapp.repository;

import com.example.myapp.model.UsuarioDAO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository <UsuarioDAO, Long> {
   List<UsuarioDAO> findByNomeCompleto(String nomeCompleto);

   UsuarioDAO findByEmail(String email);
}