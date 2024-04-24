package com.example.banco.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tabela_limites_saque")
public class LimitesSaque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double limiteMensal;
    private Double limiteDiario;
    private Double limiteSemCartao;

    // getters e setters
}
