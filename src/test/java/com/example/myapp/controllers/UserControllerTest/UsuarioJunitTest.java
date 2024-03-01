package com.example.myapp.controllers.UserControllerTest;

import com.example.myapp.model.Usuario;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UsuarioJunitTest {

    @Test
    public void testAtribuicaoAtributos() {
        // Criando um objeto Usuario para teste
        Long id = 1L;
        String cpf = "123.456.789-00";
        String senha = "senha123";
        String nomeCompleto = "Fulano de Tal";
        String email = "fulano@example.com";
        LocalDate dataNascimento = LocalDate.now(); // Data de nascimento atual, apenas para exemplo
        Usuario usuario = new Usuario(id, cpf, senha.toCharArray(), nomeCompleto, email, dataNascimento);

        // Testando se os atributos foram atribuídos corretamente
        assertEquals(id, usuario.getId(), "O ID não corresponde");
        assertEquals(cpf, usuario.getCpf(), "O CPF não corresponde");
        assertEquals(senha, usuario.getSenha(), "A senha não corresponde");
        assertEquals(nomeCompleto, usuario.getNomeCompleto(), "O nome completo não corresponde");
        assertEquals(email, usuario.getEmail(), "O email não corresponde");
        assertEquals(dataNascimento, usuario.getDataNascimento(), "A data de Nascimento não corresponde");
    }
}
