package com.adapter.logistica.Model;

import com.adapter.logistica.Strategy.CalculadoraFrete;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class FreteRequest  {
    private String tipo;
    private Double peso;
}