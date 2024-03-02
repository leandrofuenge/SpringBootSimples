package com.example.myapp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/teste";
        String user = "root";
        String password = "8YxeV6wCA9H8";

        try {
            Connection connection = DriverManager.getConnection(url, user, password);

            UsuarioDAO usuarioDAO = new UsuarioDAO(connection);

            // Adicionar usuário
            Usuario usuario = new Usuario("12345678901", "senha123", "Nome Completo", "email@example.com", new Date());
            boolean userInserted = usuarioDAO.inserirUsuario(usuario);
            if (userInserted) {
                System.out.println("Usuário inserido com sucesso!");
            } else {
                System.out.println("Falha ao inserir usuário.");
            }

            // Atualizar usuário
            boolean userUpdated = usuarioDAO.atualizarUsuario("12345678901", "Novo Nome Completo", "novoemail@example.com");
            if (userUpdated) {
                System.out.println("Usuário atualizado com sucesso!");
            } else {
                System.out.println("Falha ao atualizar usuário.");
            }

            // Remover usuário
            boolean userDeleted = usuarioDAO.removerUsuario("12345678901");
            if (userDeleted) {
                System.out.println("Usuário removido com sucesso!");
            } else {
                System.out.println("Falha ao remover usuário.");
            }

            // Ler usuário
            Usuario userRead = usuarioDAO.buscarUsuario("12345678901");
            if (userRead != null) {
                System.out.println("Usuário encontrado: " + userRead);
            } else {
                System.out.println("Usuário não encontrado.");
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
