package com.adapter.logistica.Strategy;

import org.springframework.stereotype.Component;

@Component("tercerizada")
public class FreteTercerizada implements CalculadoraFrete {
    @Override
    public Double calcularFrete(Double peso) {
        return 15.0 + peso * 1.2;
    }
}
