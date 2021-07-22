package com.salvus.me.desafio.controller;

import com.salvus.me.desafio.entity.Usuario;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioLogin {

    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public UsuarioLogin(BCryptPasswordEncoder bCryptPasswordEncoder){
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @PostMapping("/login")
    public void login(@RequestBody Usuario usuario){
        usuario.setSenha(bCryptPasswordEncoder.encode(usuario.getSenha()));
    }
}
