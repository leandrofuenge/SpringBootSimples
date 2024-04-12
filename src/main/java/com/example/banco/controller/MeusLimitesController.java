package com.example.banco.controller;

import com.example.banco.service.MeusLimitesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/meus")
public class MeusLimitesController {

    private final MeusLimitesService meusLimitesService;

    public MeusLimitesController(MeusLimitesService meusLimitesService) {
        this.meusLimitesService = meusLimitesService;
    }

    // Endpoint para visualizar meus limites
    @GetMapping("/limites")
    public ResponseEntity<Double> visualizarLimitesParaSaque(@RequestParam String cpf) {
        Double meusLimites = meusLimitesService.visualizarLimitesParaSaque(cpf);
        if (meusLimites != null) {
            return ResponseEntity.ok(meusLimites);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
