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
    private String nomecompleto;

    @Column(nullable = false)
    private String cpf;

    @Column(nullable = false)
    private String rg;

    @Column(nullable = false)
    private String datadenascimento;

    @Column(nullable = false)
    private String sexo;

    // Endereço

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
