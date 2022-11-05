package com.controle.estoque.aplication.domain.entity;

import static com.controle.estoque.aplication.domain.entity.Validacoes.validarCpf;

public class Cliente {

    private String nome;
    private String cpf;
    private Data dataNascimento;
    private Endereco endereco;
    private String email;

    public Cliente(String nome, String cpf, Data dataNascimento, Endereco endereco, String email) throws Exception {
        try {
            if (nome == null || nome == "") {
                throw new Exception("Nome inválido");
            }
            if (!validarCpf(cpf)) {
                throw new Exception("CPF inválido");
            }
            if (dataNascimento == null) {
                throw new Exception("Data de nascimento inválida");
            }
            if (endereco == null) {
                throw new Exception("Endereço inválido");
            }
            if (email == null || email == "") {
                throw new Exception("Email inválido");
            }

        } catch (Exception e) {
            throw new Exception(e);
        }

        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws Exception {
        if (!validarCpf(cpf)) {
            throw new Exception("CPF inválido");
        }
        this.cpf = cpf;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean validarCpf(String cpf){
        return Validacoes.validarCpf(cpf);
    }
}

