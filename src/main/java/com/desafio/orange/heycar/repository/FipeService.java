package com.desafio.orange.heycar.repository;

import com.desafio.orange.heycar.modelo.Veiculo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.Id;

@FeignClient(url = "https://parallelum.com.br/fipe/api/", name = "fipe")
public interface FipeService {

    @GetMapping("{id}/json")
    Veiculo buscaValorPorId(@PathVariable("id")Long Id);

}
