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

    // getters e setters
}
