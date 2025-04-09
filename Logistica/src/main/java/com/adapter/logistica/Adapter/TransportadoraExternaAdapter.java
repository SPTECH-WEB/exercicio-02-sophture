package com.adapter.logistica.Adapter;

import com.adapter.logistica.Strategy.CalculadoraFrete;
import com.adapter.logistica.Strategy.Transportadora;
import org.springframework.stereotype.Component;

    @Component("transportadoraTerceirizada")
    public class TransportadoraExternaAdapter implements Transportadora {

        private final TransportadoraExternaSimulada transportadoraExterna;

        public TransportadoraExternaAdapter() {

            this.transportadoraExterna = new TransportadoraExternaSimulada();
        }

        @Override
        public double calcularFrete(double peso) {
            Dados dados = new Dados(peso, "NORMAL");

            return transportadoraExterna.calcularCustoEnvio(dados);
        }

        @Override
        public String getModalidade() {
            return "transportadoraTerceirizada";
        }
    }
