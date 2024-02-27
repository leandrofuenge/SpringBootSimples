package com.example.myapp.services.ConexaoBancoTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TesteConexaoBancoDadosTest {

    @Test
    public void testConexaoBancoDados() {
        tests.ConexaoBancoTest.TesteConexaoBancoDados testeConexao = new tests.ConexaoBancoTest.TesteConexaoBancoDados();

        // Verifica se a conexão é bem-sucedida
        assertTrue(testeConexao.testarConexao(), "Conexão bem-sucedida com o banco de dados");
    }
}
