package com.example.banco.entity;

import jakarta.persistence.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tabela_endereco")
public class Endereco {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String cep;

    @Column(nullable = false)
    private String endereco;

    @Column(nullable = false)
    private String numero;

    @Column(nullable = false)
    private String bairro;

    @Column(nullable = false)
    private String cidade;

    @Column(nullable = false)
    private String estado;

    @OneToOne
    @JoinColumn(name = "informacoes_pessoais_id")
    private InformacoesPessoais informacoesPessoais;



    // getters e setters
}
