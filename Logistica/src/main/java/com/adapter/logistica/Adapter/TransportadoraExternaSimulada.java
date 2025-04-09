package com.adapter.logistica.Adapter;

    public class TransportadoraExternaSimulada {

        public double calcularCustoEnvio(Dados dados) {
            double taxaBase;
            if ("URGENTE".equalsIgnoreCase(dados.getTipoEntrega())) {
                taxaBase = 20.0;
            } else {
                taxaBase = 10.0;
            }
            double custoPorKg = 3.5;
            return taxaBase + (dados.getPesoKg() * custoPorKg);
        }

        public String getNomeTransportadora() {
            return "Transportadora Externa XPTO";
        }
    }

