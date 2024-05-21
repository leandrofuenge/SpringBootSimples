package com.example.banco.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import jakarta.persistence.*;

@Entity
@Table(name = "tabela_informacoes_pessoais")
public class InformacoesPessoais {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nomeCompleto;

    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false)
    private String rg;

    @Column(nullable = false)
    private String dataDeNascimento;

    @Column(nullable = false)
    private String sexo;

    @OneToOne
    @JoinColumn(name = "informacoes_pessoais_id")
    private InformacoesPessoais informacoesPessoais;



    // getters e setters
}
