package com.controle.estoque.aplication.domain.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnderecoTest {


    String cep = "87703580";
    String logradouro = "Rua A";
    String numero = "25";
    String cidade = "Paranavai";
    String estado = "Paraná";

    @Test
    void validaCep() {
        try {
            new Endereco(null, logradouro, numero, cidade, estado);
        } catch (Exception e) {
            Assertions.assertEquals("java.lang.Exception: Cep inválido", e.getMessage());
        }
    }

    @Test
    void validaLogradouro() {
        try {
            new Endereco(cep, null, numero, cidade, estado);
        } catch (Exception e) {
            Assertions.assertEquals("java.lang.Exception: Logradouro inválido", e.getMessage());
        }
    }

    @Test
    void validaNumero() {
        try {
            new Endereco(cep, logradouro, null, cidade, estado);
        } catch (Exception e) {
            Assertions.assertEquals("java.lang.Exception: Número inválido", e.getMessage());
        }
    }

    @Test
    void validaCidade() {
        try {
            new Endereco(cep, logradouro, numero, null, estado);
        } catch (Exception e) {
            Assertions.assertEquals("java.lang.Exception: Cidade inválido", e.getMessage());
        }
    }

    @Test
    void validaEstado() {
        try {
            new Endereco(cep, logradouro, numero, cidade, null);
        } catch (Exception e) {
            Assertions.assertEquals("java.lang.Exception: Estado inválido", e.getMessage());
        }
    }


}