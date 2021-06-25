package com.desafio.orange.heycar.repository;

import com.desafio.orange.heycar.modelo.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {
    List<Usuario> findAll();
}