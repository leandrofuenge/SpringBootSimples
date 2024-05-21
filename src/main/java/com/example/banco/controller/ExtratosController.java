package com.example.banco.controller;

import com.example.banco.model.ExtratosDTO;
import com.example.banco.service.ExtratosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/extratos")
public class ExtratosController {

    private final ExtratosService extratosService;

    @Autowired
    public ExtratosController(ExtratosService extratosService) {
        this.extratosService = extratosService;
    }

    @GetMapping("/fatura/{cpf}")
    public ResponseEntity<ExtratosDTO> visualizarFaturaCartao(@PathVariable String cpf) {
        ExtratosDTO extratosDTO = extratosService.visualizarFaturaCartao(cpf);
        if (extratosDTO != null) {
            return new ResponseEntity<>(extratosDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
