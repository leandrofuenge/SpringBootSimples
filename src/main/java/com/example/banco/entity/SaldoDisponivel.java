package com.example.banco.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tabela_saldo_disponivel")
public class SaldoDisponivel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Double saldoDisponivel;

    @OneToOne
    @JoinColumn(name = "informacoes_pessoais_id")
    private InformacoesPessoais informacoesPessoais;

    // getters e setters
}
