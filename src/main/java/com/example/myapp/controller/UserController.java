package com.example.myapp.controller;

import com.example.myapp.model.Usuario;
import com.example.myapp.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/adicionar")
    public ResponseEntity<Usuario> adicionarUsuario(@Valid @RequestBody Usuario usuario) {
        Usuario novoUsuario = userService.adicionarUsuario(usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(novoUsuario);
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
    public ResponseEntity<Usuario> atualizarUsuario(@PathVariable Long id, @Valid @RequestBody Usuario usuario) {
        Usuario usuarioAtualizado = userService.atualizarUsuario(id, usuario);
        if (usuarioAtualizado != null) {
            return ResponseEntity.ok(usuarioAtualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/ler/{id}")
    public ResponseEntity<Usuario> lerUsuario(@PathVariable Long id) {
        Usuario usuario = userService.lerUsuario(id);
        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/listar")
    public ResponseEntity<List<Usuario>> listarUsuarios() {
        List<Usuario> usuarios = userService.listarUsuarios();
        return ResponseEntity.ok(usuarios);
    }
}
