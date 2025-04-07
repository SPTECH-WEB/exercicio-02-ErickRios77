package com.exemplo.sistemaEntrega.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FreteService {
    private final List<FreteStrategy> estrategias;

    public FreteService(List<FreteStrategy> estrategias) {
        this.estrategias = estrategias;
    }

    public double calcular(String modalidade, double peso) {
        return estrategias.stream().filter(e -> e.modalidade().equalsIgnoreCase(modalidade)).findFirst().orElseThrow(() -> new IllegalArgumentException("Tipo de Frete inválido")).calcular(peso);
    }
}
