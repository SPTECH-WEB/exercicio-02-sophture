package com.adapter.logistica.Service;

import com.adapter.logistica.Strategy.CalculadoraFrete;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class FreteService  {
    private final Map<String, CalculadoraFrete> estrategias;

    public FreteService(Map<String, CalculadoraFrete> estrategias) {
        this.estrategias = estrategias;
    }

    public Double calcularFrete(String tipo, Double peso){
        System.out.println(estrategias.get(tipo.toLowerCase()));
        CalculadoraFrete strategy = estrategias.get(tipo.toLowerCase());
        if(strategy == null){
            throw new IllegalArgumentException("Tipo de entrega inválida: " + tipo);
        }

       return strategy.calcularFrete(peso);
    }

}
