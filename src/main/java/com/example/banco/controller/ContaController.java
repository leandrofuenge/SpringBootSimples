package com.example.banco.controller;

import com.example.banco.service.ContaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/conta/")
public class ContaController {

    private final ContaService contaService;

    // Construtor que injeta uma instância de ContaService
    public ContaController(ContaService contaService) {
        this.contaService = contaService;
    }

    // Endpoint para visualizar saldo disponível
    @GetMapping("saldo")
    public ResponseEntity<Double> visualizarSaldoDisponivel(@RequestParam String cpf) {
        Double saldoDisponivel = contaService.visualizarSaldoDisponivel(cpf);
        if (saldoDisponivel != null) {
            return new ResponseEntity<>(saldoDisponivel, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
