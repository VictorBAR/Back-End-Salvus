package com.salvus.me.desafio.service;

import com.salvus.me.desafio.entity.Usuario;
import com.salvus.me.desafio.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static java.util.Collections.emptyList;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    UsuarioRepository usuarioDAO;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        Usuario usuario = Optional.ofNullable(usuarioDAO.findByEmail(email))
                .orElseThrow(() -> new UsernameNotFoundException("Empresa não encontrada"));
        return new User
                (usuario.getEmail(), usuario.getSenha(), emptyList());
    }
}
