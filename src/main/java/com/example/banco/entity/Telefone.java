package com.example.banco.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tabela_telefone")
public class Telefone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String celular;

    @OneToOne
    @JoinColumn(name = "informacoes_pessoais_id")
    private InformacoesPessoais informacoesPessoais;



    // getters e setters
}
