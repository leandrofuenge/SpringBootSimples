package com.example.banco.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tabela_limites_pagamento")
public class LimitesPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double limiteMensalPagamento;
    private Double limiteDiarioPagamento;
    private Double limiteMensalAgendamentoPagamento;
    private Double limiteDiarioAgendamentoPagamento;

    // getters e setters
}
