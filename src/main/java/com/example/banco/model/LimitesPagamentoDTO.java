package com.example.banco.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class LimitesPagamentoDTO {

    private Double MensalPagamento;
    private Double DiarioPagamento;
    private Double MensalAgendamentoPagamento;
    private Double DiarioAgendamentoPagamento;

    public void LimitesPagamento() {
        // Construtor padrão necessário para serialização/desserialização
    }

    public LimitesPagamentoDTO(Double MensalPagamento, Double DiarioPagamento, Double MensalAgendamentoPagamento, Double DiarioAgendamentoPagamento) {
        this.MensalPagamento = MensalPagamento;
        this.DiarioPagamento = DiarioPagamento;
        this.MensalAgendamentoPagamento = MensalAgendamentoPagamento;
        this.DiarioAgendamentoPagamento = DiarioAgendamentoPagamento;
    }
    // Getters e Setters
}
