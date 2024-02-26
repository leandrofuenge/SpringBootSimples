package com.example.tests;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexaoBancoDados {
    public static void main(String[] args) {
        Connection conexao = null;
        String url = "jdbc:mysql://localhost:3306/teste";
        String usuario = "root";
        String senha = "8YxeV6wCA9H8";

        try {
            // Registrar o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Estabelecer conexao com o banco de dados
            conexao = DriverManager.getConnection(url, usuario,senha);

            if (conexao != null) {
                System.out.println("Conexao bem-sucedida!");
            } else {
                System.out.println("Falha ao conectar ao banco de dados.");
            }
        } catch (ClassNotFoundException e) {
            System.out.println("Driver JDBC nao encontrado.");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Falha na conexao com o banco de dados.");
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
    }
}