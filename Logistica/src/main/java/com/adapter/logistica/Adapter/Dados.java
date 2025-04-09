package com.adapter.logistica.Adapter;

public class Dados {
    private double pesoKg;
    private String tipoEntrega;

    public Dados(double pesoKg, String tipoEntrega) {
        this.pesoKg = pesoKg;
        this.tipoEntrega = tipoEntrega;
    }

    public double getPesoKg() {

        return pesoKg;
    }

    public String getTipoEntrega() {

        return tipoEntrega;
    }
}
