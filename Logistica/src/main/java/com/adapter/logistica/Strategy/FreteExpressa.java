package com.adapter.logistica.Strategy;

import org.springframework.stereotype.Component;

    @Component("expressa")
    public class FreteExpressa implements CalculadoraFrete {

        @Override
        public Double calcularFrete(Double peso) {
            return 20.0 + peso * 1.5;
        }
    }

