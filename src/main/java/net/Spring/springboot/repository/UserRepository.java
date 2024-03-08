package net.Spring.springboot.repository;

import net.Spring.springboot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Métodos personalizados de consulta podem ser adicionados aqui, se necessário
}
