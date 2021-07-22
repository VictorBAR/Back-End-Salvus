package com.salvus.me.desafio.service;

import com.salvus.me.desafio.dto.UsuarioRequest;
import com.salvus.me.desafio.entity.Usuario;
import com.salvus.me.desafio.repository.UsuarioRepository;
import org.modelmapper.ModelMapper;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioDAO;
    private final ModelMapper modelMapper;

    public UsuarioService(UsuarioRepository ususarioDAO, ModelMapper modelMapper) {
        this.usuarioDAO = ususarioDAO;
        this.modelMapper = modelMapper;
    }

    public Usuario cadastrarUsuario(UsuarioRequest usuario){
        BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
        usuario.setSenha(bCryptPasswordEncoder.encode(usuario.getSenha()));
        return usuarioDAO.save(modelMapper.map(usuario, Usuario.class));
    }

}
