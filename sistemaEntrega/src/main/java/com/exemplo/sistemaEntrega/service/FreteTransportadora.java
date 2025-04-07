package com.exemplo.sistemaEntrega.service;

import org.springframework.stereotype.Component;

@Component
public class FreteTransportadora implements FreteStrategy{
    @Override
    public double calcular(double peso) {
        return peso*1.5;
    }

    @Override
    public String modalidade() {
        return "Entrega Transportadora";
    }
}
