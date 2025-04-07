package com.exemplo.sistemaEntrega.service;

import org.springframework.stereotype.Service;

@Service("externa")
public class FreteAdapter implements FreteStrategy{
    private final FreteExterno externo;

    public FreteAdapter(FreteExterno externo){
        this.externo = externo;
    }

    @Override
    public double calcular(double valor){
        return externo.calcular(valor);
    }

    @Override
    public String modalidade() {
        return externo.modalidade();
    }
}
