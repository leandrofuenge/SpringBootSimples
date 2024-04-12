package com.example.banco.controller;

import com.example.banco.entity.Usuario;
import com.example.banco.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("admin")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AdminController {

    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @PostMapping("/criar-usuario")
    public ResponseEntity<Usuario> criarUsuario(@RequestBody Usuario usuario) {
        Usuario novoUsuario = adminService.criarUsuario(usuario);
        return new ResponseEntity<>(novoUsuario, HttpStatus.CREATED);
    }

    @GetMapping("/visualizar/todos/usuarios/cadastros")
    public ResponseEntity<List<Usuario>> obterTodosUsuarios() {
        List<Usuario> usuarios = adminService.obterTodosUsuarios();
        return new ResponseEntity<>(usuarios, HttpStatus.OK);
    }

    @GetMapping("/obter/todos/usuarios/cpf/{cpf}")
    public ResponseEntity<?> obterUsuarioPorCpf(@PathVariable String cpf) {
        Usuario usuario = adminService.obterUsuarioPorCpf(cpf);
        if (usuario != null) {
            return new ResponseEntity<>(usuario, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Usuário não encontrado", HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/modificar/todos/usuarios/{cpf}")
    public ResponseEntity<?> modificarUsuarioPorCpf(@PathVariable String cpf, @RequestBody Usuario usuario) {
        Usuario usuarioModificado = adminService.modificarUsuarioPorCpf(cpf, usuario);
        if (usuarioModificado != null) {
            return new ResponseEntity<>(usuarioModificado, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Usuário não encontrado", HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/excluir/todos/usuarios/{cpf}")
    public ResponseEntity<?> excluirUsuarioPorCpf(@PathVariable String cpf) {
        boolean deleted = adminService.excluirUsuarioPorCpf(cpf);
        if (deleted) {
            return new ResponseEntity<>("Usuário excluído com sucesso", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Usuário não encontrado", HttpStatus.NOT_FOUND);
        }
    }
}
