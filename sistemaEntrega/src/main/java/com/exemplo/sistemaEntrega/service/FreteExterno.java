package com.exemplo.sistemaEntrega.service;

import org.springframework.stereotype.Service;

@Service("externo")
public class FreteExterno implements FreteStrategy{
    @Override
    public double calcular(double peso){
        return peso * 1.25;
    }

    @Override
    public String modalidade() {
        return "Entrega Externa";
    }
}
