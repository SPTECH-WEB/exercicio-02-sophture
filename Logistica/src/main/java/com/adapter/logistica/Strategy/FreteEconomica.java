package com.adapter.logistica.Strategy;

import org.springframework.stereotype.Component;

@Component("economica")
public class FreteEconomica implements CalculadoraFrete {

    @Override
    public Double calcularFrete(Double peso) {
        return 10.0 + peso * 1.0;
    }
}