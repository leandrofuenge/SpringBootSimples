package com.example.myapp.controllers.UserControllerTest;/*
 * UsuarioTest.java
 *
 * Este arquivo contém testes para verificar a atribuição correta dos atributos da classe Usuario.
 * Ele cria um objeto Usuario com valores específicos e verifica se os atributos foram atribuídos corretamente.
 */

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
        com.example.model.Usuario usuario = new com.example.model.Usuario(id, cpf, senha, nomeCompleto, email, dataNascimento);

        // Testando se os atributos foram atribuídos corretamente
        assertEquals(id, usuario.getId(), "ID não corresponde");
        assertEquals(cpf, usuario.getCpf(), "CPF não corresponde");
        assertEquals(senha, usuario.getSenha(), "Senha não corresponde");
        assertEquals(nomeCompleto, usuario.getNomeCompleto(), "Nome completo não corresponde");
        assertEquals(email, usuario.getEmail(), "Email não corresponde");
        assertEquals(dataNascimento, usuario.getDataNascimento(), "Data de Nascimento não corresponde");
    }
}
