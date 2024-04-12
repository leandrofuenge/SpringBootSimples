package com.example.banco.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LimitesDTO {

    private Double mensal;
    private Double diario;
    private Double semcartao;

    public LimitesDTO() {
        // Construtor padrão necessário para serialização/desserialização
    }

    public LimitesDTO(Double mensal, Double diario, Double semcartao) {
        this.mensal = mensal;
        this.diario = diario;
        this.semcartao = semcartao;
    }

    // Getters e Setters

}
