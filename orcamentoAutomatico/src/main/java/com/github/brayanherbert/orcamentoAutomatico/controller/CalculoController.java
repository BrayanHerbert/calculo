package com.github.brayanherbert.orcamentoAutomatico.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://127.0.0.1:3000/")
public class CalculoController {

    @PostMapping("/calcular")
    public CalculoResposta calculoResposta(@RequestBody CalculoRequest calculoRequest){

        double totalMetro = calculoRequest.getLarguraMetro() * calculoRequest.getComprimentoMetro();
        double totalPreco = totalMetro * calculoRequest.getSeuMetro();

        return new CalculoResposta(totalMetro, totalPreco);
    }
}
