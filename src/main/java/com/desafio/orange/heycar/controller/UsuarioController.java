package com.desafio.orange.heycar.controller;

import com.desafio.orange.heycar.controller.form.UsuarioForm;
import com.desafio.orange.heycar.modelo.Usuario;
import com.desafio.orange.heycar.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;
import java.net.URI;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping(consumes = "application/json")
    public ResponseEntity<?> cadastraUsuario(@RequestBody Usuario usuario, UriComponentsBuilder uriBuilder){
            Usuario usuarioCadastrado = usuarioRepository.save(usuario);

            URI uri = uriBuilder.path("/usuarios/{id}").buildAndExpand(usuarioCadastrado.getId()).toUri();
            return ResponseEntity.created(uri).body(new Usuario());

    }

}
