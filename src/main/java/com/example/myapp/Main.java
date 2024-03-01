package com.example.myapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;


public class Main {
    public static void main(String[] args) {
        // Configurações de conexão com o banco de dados MySQL
        String url = "jdbc:mysql://localhost:3306/teste";
        String user = "root";
        String password = "8YxeV6wCA9H8";

        try {
            // Carregar e registrar o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Estabelecer a conexão com o banco de dados
            Connection connection = DriverManager.getConnection(url, user, password);

            // Comando SQL para inserir um novo usuário
            String insertSql = "INSERT INTO Usuario (cpf, senha, nomeCompleto, email, dataNascimento) VALUES (?, ?, ?, ?, ?)";

            // Criar um PreparedStatement para evitar injeção de SQL
            PreparedStatement insertStatement = connection.prepareStatement(insertSql);

            // Definir os valores dos parâmetros para inserção
            insertStatement.setString(1, "12345678901"); // Exemplo de CPF
            insertStatement.setString(2, "senha123"); // Exemplo de senha
            insertStatement.setString(3, "Nome Completo");
            insertStatement.setString(4, "email@example.com");
            insertStatement.setDate(5, new java.sql.Date(new Date().getTime())); // Convertendo Date para java.sql.Date

            // Executar o comando SQL de inserção
            int rowsInserted = insertStatement.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Usuário inserido com sucesso!");
            } else {
                System.out.println("Falha ao inserir usuário.");
            }

            // Comando SQL para atualizar um usuário
            String updateSql = "UPDATE Usuario SET nomeCompleto = ?, email = ? WHERE cpf = ?";

            // Criar um PreparedStatement para evitar injeção de SQL
            PreparedStatement updateStatement = connection.prepareStatement(updateSql);

            // Definir os valores dos parâmetros para atualização
            updateStatement.setString(1, "Novo Nome Completo");
            updateStatement.setString(2, "novoemail@example.com");
            updateStatement.setString(3, "12345678901"); // CPF do usuário a ser atualizado

            // Executar o comando SQL de atualização
            int rowsUpdated = updateStatement.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println("Usuário atualizado com sucesso!");
            } else {
                System.out.println("Falha ao atualizar usuário.");
            }

            // Comando SQL para retirar um usuário
            String deleteSql = "DELETE FROM Usuario WHERE cpf = ?";

            // Criar um PreparedStatement para evitar injeção de SQL
            PreparedStatement deleteStatement = connection.prepareStatement(deleteSql);

            // Definir o CPF do usuário que você deseja retirar
            deleteStatement.setString(1, "12345678901"); // CPF do usuário a ser retirado

            // Executar o comando SQL de retirar
            int rowsDeleted = deleteStatement.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("Usuário retirado com sucesso!");
            } else {
                System.out.println("Falha ao retirar usuário.");
            }

            // Comando SQL para ler um usuário
            String selectSql = "SELECT * FROM Usuario WHERE cpf = ?";

            // Criar um PreparedStatement para evitar injeção de SQL
            PreparedStatement selectStatement = connection.prepareStatement(selectSql);

            // Definir o CPF do usuário que você deseja ler
            selectStatement.setString(1, "12345678901"); // CPF do usuário a ser lido

            // Executar o comando SQL de leitura e obter o resultado em um ResultSet
            ResultSet resultSet = selectStatement.executeQuery();

            // Processar os resultados
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String cpf = resultSet.getString("cpf");
                String nomeCompleto = resultSet.getString("nomeCompleto");
                String email = resultSet.getString("email");
                Date dataNascimento = resultSet.getDate("dataNascimento");

                // Faça o que você precisa com os detalhes do usuário lido
            }

            // Fechar os recursos
            insertStatement.close();
            updateStatement.close();
            deleteStatement.close();
            selectStatement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
