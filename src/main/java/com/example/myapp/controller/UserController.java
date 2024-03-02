package com.example.myapp.controller;

import com.example.myapp.model.UsuarioDAO;
import com.example.myapp.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/adicionar")
    public ResponseEntity<UsuarioDAO> adicionarUsuario(@Valid @RequestBody UsuarioDAO usuarioDAO) {
        UsuarioDAO novoUsuarioDAO = userService.adicionarUsuario(usuarioDAO);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoUsuarioDAO);
    }

    @DeleteMapping("/excluir/{id}")
    public ResponseEntity<Void> excluirUsuario(@PathVariable Long id) {
        boolean excluido = userService.excluirUsuario(id);
        if (excluido) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<UsuarioDAO> atualizarUsuario(@PathVariable Long id, @Valid @RequestBody UsuarioDAO usuarioDAO) {
        UsuarioDAO usuarioDAOAtualizado = userService.atualizarUsuario(id, usuarioDAO);
        if (usuarioDAOAtualizado != null) {
            return ResponseEntity.ok(usuarioDAOAtualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/ler/{id}")
    public ResponseEntity<UsuarioDAO> lerUsuario(@PathVariable Long id) {
        UsuarioDAO usuarioDAO = userService.lerUsuario(id);
        if (usuarioDAO != null) {
            return ResponseEntity.ok(usuarioDAO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/listar")
    public ResponseEntity<List<UsuarioDAO>> listarUsuarios() {
        List<UsuarioDAO> usuarioDAOS = userService.listarUsuarios();
        return ResponseEntity.ok(usuarioDAOS);
    }
}
