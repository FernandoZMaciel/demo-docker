package com.example.demo.controller;


import com.example.demo.domain.Usuario;
import com.example.demo.repository.UsuarioRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    public UsuarioController(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios() {
        return usuarioRepository.findAll();
    }
}
