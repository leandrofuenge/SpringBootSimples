package com.example.banco.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tabela_limites_saque")
public class LimitesSaque {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Double limiteMensalSaque;
    private Double limiteDiarioSaque;
    private Double limiteSemCartaoSaque;

    @OneToOne
    @JoinColumn(name = "informacoes_pessoais_id")
    private InformacoesPessoais informacoesPessoais;


    // getters e setters
}
