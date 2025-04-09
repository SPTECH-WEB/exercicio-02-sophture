package com.adapter.logistica.Strategy;

public interface Transportadora {
    double calcularFrete(double peso);

    String getModalidade();
}
