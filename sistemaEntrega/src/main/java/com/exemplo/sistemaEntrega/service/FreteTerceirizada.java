package com.exemplo.sistemaEntrega.service;

import org.springframework.stereotype.Component;

@Component
public class FreteTerceirizada implements FreteStrategy{
    @Override
    public double calcular(double peso) {
        return peso*1.4;
    }

    @Override
    public String modalidade() {
        return "Entrega Terceirizada";
    }
}
