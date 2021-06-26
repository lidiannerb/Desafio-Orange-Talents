package com.desafio.orange.heycar.controller;

import com.desafio.orange.heycar.modelo.Veiculo;
import com.desafio.orange.heycar.repository.FipeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Id;

@RestController
public class BuscaVeiculoController {

    @Autowired
    private FipeService fipeService;

    @GetMapping("/{id}")
    public ResponseEntity<Veiculo> getId(@PathVariable Long Id){

        Veiculo veiculo = fipeService.buscaValorPorId(Id);

        return veiculo != null? ResponseEntity.ok().body(veiculo) : ResponseEntity.notFound().build();

    }

}
