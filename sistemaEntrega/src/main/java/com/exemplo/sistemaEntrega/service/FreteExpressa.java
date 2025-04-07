package com.exemplo.sistemaEntrega.service;

import org.springframework.stereotype.Component;

@Component
public class FreteExpressa implements FreteStrategy{
    @Override
    public double calcular(double peso) {
        return peso*1.8;
    }

    @Override
    public String modalidade() {
        return "Entrega Expressa";
    }
}
