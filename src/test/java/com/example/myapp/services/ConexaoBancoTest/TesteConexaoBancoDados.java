package com.example.myapp.services.ConexaoBancoTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexaoBancoDados {
    public boolean testarConexao() {
        Connection conexao = null;
        String url = "jdbc:mysql://localhost:3306/teste";
        String usuario = "root";
        String senha = "8YxeV6wCA9H8";

        try {
            // Registrar o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Estabelecer conexão com o banco de dados
            conexao = DriverManager.getConnection(url, usuario, senha);

            return (conexao != null);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC não encontrado.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Falha na conexão com o banco de dados.");
            e.printStackTrace();
        } finally {
            try {
                if (conexao != null) {
                    conexao.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
