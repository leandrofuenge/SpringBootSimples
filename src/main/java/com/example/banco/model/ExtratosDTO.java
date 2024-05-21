package com.example.banco.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ExtratosDTO {

    private Double contaSalario;
    private Double faturaDoCartao;
    private Double poupanca; // Variável adicionada
    private String dataExtratos; // Variável adicionada

    public ExtratosDTO() {
        // Construtor padrão necessário para serialização/desserialização
    }

    public ExtratosDTO(Double contaSalario, Double faturaDoCartao, Double poupanca, String dataExtratos) {
        this.contaSalario = contaSalario;
        this.faturaDoCartao = faturaDoCartao;
        this.poupanca = poupanca;
        this.dataExtratos = dataExtratos;
    }

    // Getters e Setters
}
