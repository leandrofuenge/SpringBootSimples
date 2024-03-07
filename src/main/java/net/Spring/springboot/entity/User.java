package net.Spring.springboot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Dados Pessoais

    @Column(nullable = false)
    private String nomeCompleto;

    @Column(nullable = false)
    private String CPF;

    @Column(nullable = false)
    private String RG;

    @Column(nullable = false)
    private String DataDeNascimento;

    @Column(nullable = false)
    private String sexo;

    // Endereço

    @Column(nullable = false)
    private String CEP;

    @Column(nullable = false)
    private String Endereco;

    @Column(nullable = false)
    private String numero;

    @Column(nullable = false)
    private String Bairro;

    @Column(nullable = false)
    private String Cidade;

    @Column(nullable = false)
    private String Estado;

    // Online
    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String senha;


    // Telefone

    @Column(nullable = false)
    private String celular; // Corrigido para começar com letra minúscula

    // Outros construtores, getters e setters
}
