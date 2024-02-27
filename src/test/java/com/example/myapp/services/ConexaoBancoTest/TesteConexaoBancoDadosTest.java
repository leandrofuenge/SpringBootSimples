package com.example.myapp.services.ConexaoBancoTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TesteConexaoBancoDadosTest {

    @Test
    public void testConexaoBancoDados() {
        TesteConexaoBancoDados testeConexao = new TesteConexaoBancoDados();

        assertTrue(testeConexao.testarConexao(), "Conexao bem-sucedida com o banco de dados");
    }
}

























