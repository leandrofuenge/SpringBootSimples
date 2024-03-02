package com.example.myapp.model;

import java.util.Date;

public class Usuario {
    private final String cpf;
    private final String senha;
    private final String nomeCompleto;
    private final String email;
    private final Date dataNascimento;

    public Usuario(String cpf, String senha, String nomeCompleto, String email, Date dataNascimento) {
        this.cpf = cpf;
        this.senha = senha;
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "cpf='" + cpf + '\'' +
                ", nomeCompleto='" + nomeCompleto + '\'' +
                ", email='" + email + '\'' +
                ", dataNascimento=" + dataNascimento +
                '}';
    }
}
