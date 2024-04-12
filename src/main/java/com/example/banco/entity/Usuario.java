package com.example.banco.entity;

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
@Table(name = "SISTEMABANCOUSUARIOS")
public class Usuario {

    // Getters and Setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //Dados Pessoais

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
    private String celular;

    // Saldo disponível
    @Column(nullable = false)
    private Double saldodisponivel;

    //****************//****************//****************//****************//****************

    //---Limites para Saque---//

    //Limites Totais//

    // Limite Mensal
    private Double mensal;

    // Limite Diario
    private Double diario;

    //-----Limites sem cartao-----//
    private Double semcartao;

    //****************//****************//****************//****************//****************

    //--Limites para pagamento--//

    //Limites totais//

    private Double MensalPagamento;
    private Double DiarioPagamento;
    private Double MensalAgendamentoPagamento;
    private Double DiarioAgendamentoPagamento;
}
