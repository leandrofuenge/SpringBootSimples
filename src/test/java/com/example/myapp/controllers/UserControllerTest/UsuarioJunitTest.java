package com.example.myapp.controllers.UserControllerTest;

import com.example.myapp.model.Usuario;
import org.junit.jupiter.api.Test;

import java.util.Date;

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
        Date dataNascimento = new Date(); // Data de nascimento atual, apenas para exemplo
        Usuario usuario = new Usuario(id, cpf, senha, nomeCompleto, email, dataNascimento);

        // Testando se os atributos foram atribuídos corretamente
        assertEquals(id, usuario.getId(), "ID não corresponde");
        assertEquals(cpf, usuario.getCpf(), "CPF não corresponde");
        assertEquals(senha, usuario.getSenha(), "Senha não corresponde");
        assertEquals(nomeCompleto, usuario.getNomeCompleto(), "Nome completo não corresponde");
        assertEquals(email, usuario.getEmail(), "Email não corresponde");
        assertEquals(dataNascimento, usuario.getDataNascimento(), "Data de Nascimento não corresponde");
    }
}
