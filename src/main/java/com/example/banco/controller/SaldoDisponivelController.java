package com.example.banco.controller;

import com.example.banco.service.SaldoDisponivelService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/conta/")
public class SaldoDisponivelController {

    private final SaldoDisponivelService contaService;

    // Construtor que injeta uma instância de ContaService
    public SaldoDisponivelController(SaldoDisponivelService contaService) {
        this.contaService = contaService;
    }

    // Endpoint para visualizar saldo disponível
    @GetMapping("Saldo")
    public ResponseEntity<Double> visualizarSaldoDisponivel(@RequestParam String cpf) {
        Double saldoDisponivel = contaService.visualizarSaldoDisponivel(cpf);
        if (saldoDisponivel != null) {
            return new ResponseEntity<>(saldoDisponivel, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
