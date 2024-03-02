package com.example.myapp.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class UsuarioDAO {

    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    private final Connection connection;

    public UsuarioDAO(Connection connection) {
        this.connection = connection;
    }


    public boolean inserirUsuario(Usuario usuario) throws SQLException {
        String sql = "INSERT INTO Usuario (cpf, senha, nomeCompleto, email, dataNascimento) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, usuario.getCpf());
            statement.setString(2, usuario.getSenha());
            statement.setString(3, usuario.getNomeCompleto());
            statement.setString(4, usuario.getEmail());
            statement.setDate(5, new java.sql.Date(usuario.getDataNascimento().getTime()));
            return statement.executeUpdate() > 0;
        }
    }

    public boolean atualizarUsuario(String cpf, String novoNomeCompleto, String novoEmail) throws SQLException {
        String sql = "UPDATE Usuario SET nomeCompleto = ?, email = ? WHERE cpf = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, novoNomeCompleto);
            statement.setString(2, novoEmail);
            statement.setString(3, cpf);
            return statement.executeUpdate() > 0;
        }
    }

    public boolean removerUsuario(String cpf) throws SQLException {
        String sql = "DELETE FROM Usuario WHERE cpf = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, cpf);
            return statement.executeUpdate() > 0;
        }
    }

    public Usuario buscarUsuario(String cpf) throws SQLException {
        String sql = "SELECT * FROM Usuario WHERE cpf = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, cpf);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    String cpfResult = resultSet.getString("cpf");
                    String senha = resultSet.getString("senha");
                    String nomeCompleto = resultSet.getString("nomeCompleto");
                    String email = resultSet.getString("email");
                    Date dataNascimento = resultSet.getDate("dataNascimento");
                    return new Usuario(cpfResult, senha, nomeCompleto, email, dataNascimento);
                }
            }
        }
        return null;
    }

    public Long getId() {
        return id;
    }
}
