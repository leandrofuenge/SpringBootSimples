package com.example.banco.controller;

import com.example.banco.model.LimitesDTO;
import com.example.banco.model.LimitesPagamentoDTO;
import com.example.banco.service.MeusLimitesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/meus-limites")
public class MeusLimitesController {

    private final MeusLimitesService meusLimitesService;

    public MeusLimitesController(MeusLimitesService meusLimitesService) {
        this.meusLimitesService = meusLimitesService;
    }

    // Endpoint para visualizar meus limites
    @GetMapping("/Saque")
    public ResponseEntity<LimitesDTO> visualizarLimitesParaSaque(@RequestParam String cpf) {
        LimitesDTO meusLimites = meusLimitesService.visualizarLimitesParaSaque(cpf);
        if (meusLimites != null) {
            return ResponseEntity.ok(meusLimites);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/Pagamento")
    public ResponseEntity<LimitesPagamentoDTO> visualizarLimitesPagamento(@RequestParam String cpf) {
      LimitesPagamentoDTO limitesPagamentoDTO = meusLimitesService.visualizarLimitesPagamento(cpf);
      if (limitesPagamentoDTO != null) {
          return ResponseEntity.ok(limitesPagamentoDTO);
      } else {
          return ResponseEntity.notFound().build();
      }
    }
}

