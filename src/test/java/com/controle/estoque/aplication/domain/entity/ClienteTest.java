package com.controle.estoque.aplication.domain.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ClienteTest {


    String nome = "Robson";
    String cpf = "24114607080";
    Data dataNascimento = new Data(10, 12, 1992);
    Endereco endereco = new Endereco("81330600", "Rua a", "41", "Paranavai", "Paraná");
    String email = "email@email.com.br";

    ClienteTest() throws Exception {
    }


    @Test
    void validaNome() {
        try {
            new Cliente("", cpf, dataNascimento, endereco, email);
        } catch (Exception e) {
            Assertions.assertEquals("java.lang.Exception: Nome inválido", e.getMessage());
        }
    }

    @Test
    void validarCPF() {
        try {
            new Cliente(nome, "0649703391", dataNascimento, endereco, email);
        } catch (Exception e) {
            Assertions.assertEquals("java.lang.Exception: CPF inválido", e.getMessage());
        }
    }

    @Test
    void validaDataNascimento() {
        try {
            new Cliente(nome, cpf, null, endereco, email);
        } catch (Exception e) {
            Assertions.assertEquals("java.lang.Exception: Data de nascimento inválida", e.getMessage());
        }
    }

    @Test
    void validaLogradouro() {
        try {
            new Cliente(nome, cpf, dataNascimento, null, email);
        } catch (Exception e) {
            Assertions.assertEquals("java.lang.Exception: Endereço inválido", e.getMessage());
        }
    }

    @Test
    void validaEmail() {
        try {
            new Cliente(nome, cpf, dataNascimento, endereco, "");
        } catch (Exception e) {
            Assertions.assertEquals("java.lang.Exception: Email inválido", e.getMessage());
        }
    }

}