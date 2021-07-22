package com.salvus.me.desafio.dto;

import java.time.LocalDate;                                                                                                                                                         

public class UsuarioRequest {

    private String nome;
    private LocalDate dataNascimento;
    private String email;
    private String senha;
    private String cpf;
    private String telefone;
    private String genero;
    private String profissao;
    private String numeroDeRegistro;
    private String especialidade;

    public UsuarioRequest(){}

    public UsuarioRequest(String nome, LocalDate dataNascimento, String email, String senha, String cpf, String telefone, String genero, String profissao, String numeroDeRegistro, String especialidade) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.telefone = telefone;
        this.genero = genero;
        this.profissao = profissao;
        this.numeroDeRegistro = numeroDeRegistro;
        this.especialidade = especialidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) { this.email = email; }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getNumeroDeRegistro() {
        return numeroDeRegistro;
    }

    public void setNumeroDeRegistro(String numeroDeRegistro) {
        this.numeroDeRegistro = numeroDeRegistro;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

}
