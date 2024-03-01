package com.example.myapp.model;

import java.time.LocalDate;
import java.util.Objects;

public class Usuario {
    private Long id;
    private final String cpf;
    private final char[] senha;
    private final String nomeCompleto;
    private final String email;
    private final LocalDate dataNascimento;

    // Construtor
    public Usuario(Long id, String cpf, char[] senha, String nomeCompleto, String email, LocalDate dataNascimento) {
        this.id = id;
        this.cpf = cpf;
        this.senha = senha;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    // Getters

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getCpf() {
        return cpf;
    }

    public char[] getSenha() {
        return senha.clone(); // Retorna uma cópia da senha para garantir imutabilidade
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    // Equals e HashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // toString() para representação do objeto
    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", cpf='" + cpf + '\'' +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", email='" + email + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
