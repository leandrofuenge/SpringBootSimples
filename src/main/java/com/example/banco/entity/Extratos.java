package com.example.banco.entity;

import jakarta.persistence.*;

import jakarta.persistence.Entity;

@Entity
@Table(name = "tabela_extratos")
public class Extratos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "fatura_do_cartao", nullable = false)
    private Double faturaDoCartao;

    @Column(name = "poupanca", nullable = false)
    private Double poupanca;

    @Column(name = "conta_salario", nullable = false)
    private Double contaSalario;

    @Column(name = "data_extratos", nullable = false)
    private String dataExtratos;

    @OneToOne
    @JoinColumn(name = "informacoes_pessoais_id")
    private InformacoesPessoais informacoesPessoais;

    // Getters e Setters
}

