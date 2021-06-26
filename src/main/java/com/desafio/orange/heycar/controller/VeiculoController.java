package com.desafio.orange.heycar.controller;

import com.desafio.orange.heycar.modelo.Veiculo;
import com.desafio.orange.heycar.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import java.net.URI;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoRepository veiculoRepository;

    @PostMapping(consumes = "application/json")
    public ResponseEntity<?> cadastraVeiculo(@RequestBody Veiculo veiculo, UriComponentsBuilder uriBuilder){
            Veiculo veiculoCadastrado = veiculoRepository.save(veiculo);

            URI uri = uriBuilder.path("/veiculos/{id}").buildAndExpand(veiculoCadastrado.getId()).toUri();
            return ResponseEntity.created(uri).body(new Veiculo());

    }

}
