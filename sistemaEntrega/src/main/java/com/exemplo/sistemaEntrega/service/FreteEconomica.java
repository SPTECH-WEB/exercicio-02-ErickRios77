package com.exemplo.sistemaEntrega.service;

import org.springframework.stereotype.Component;

@Component
public class FreteEconomica implements FreteStrategy{
    @Override
    public double calcular(double peso) {
        return peso*1.2;
    }

    @Override
    public String modalidade() {
        return "Entrega Economica";
    }
}
