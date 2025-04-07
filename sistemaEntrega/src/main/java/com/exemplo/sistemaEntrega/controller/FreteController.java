package com.exemplo.sistemaEntrega.controller;

import com.exemplo.sistemaEntrega.service.FreteService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/frete")
public class FreteController {
    private final FreteService freteService;
    public FreteController(FreteService freteService) {
        this.freteService = freteService;
    }

    @GetMapping
    public String calculoFrete(@Qualifier("externa") @RequestParam String modalidade, @RequestParam double peso) {
        return "O valor do frete para a modalidade de "+modalidade+" é de R$"+freteService.calcular(modalidade, peso);
    }
}
