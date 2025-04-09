package com.adapter.logistica.Controller;

import com.adapter.logistica.Model.FreteRequest;
import com.adapter.logistica.Service.FreteService;
import com.adapter.logistica.Strategy.CalculadoraFrete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fretes")
public class FreteController {

    private final FreteService freteService;

    public FreteController(FreteService freteService) {
        this.freteService = freteService;
    }

    @PostMapping
    public ResponseEntity<?> realizarEntrega(@RequestBody FreteRequest freteRequest){
        return ResponseEntity.ok(freteService.calcularFrete(freteRequest.getTipo(), freteRequest.getPeso()));
    }
}
