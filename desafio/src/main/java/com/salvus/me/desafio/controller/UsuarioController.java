package com.salvus.me.desafio.controller;

import com.salvus.me.desafio.dto.UsuarioRequest;
import com.salvus.me.desafio.entity.Usuario;
import com.salvus.me.desafio.repository.UsuarioRepository;
import com.salvus.me.desafio.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            UsuarioController {

    @Autowired
    UsuarioRepository usuarioDAO;

    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/usuarios")
    public ResponseEntity<List<Usuario>> listarUsuarios(){
        return new ResponseEntity(usuarioDAO.findAll(), HttpStatus.OK);
    }

    @PostMapping("/usuarios/cadastrar")
    public ResponseEntity<Usuario> cadastrarUsuario(@RequestBody @Valid UsuarioRequest usuario){
        return new ResponseEntity(usuarioService.cadastrarUsuario(usuario), HttpStatus.CREATED);
    }
}
