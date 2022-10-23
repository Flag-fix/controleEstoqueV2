package com.controle.estoque.aplication.domain.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EntregaTest {

    String codigo = "1025411AAA";

    Data dataEntrega = new Data(5, 10, 2022);

    List<Produto> produtos = List.of(new Produto("AAA", "produto", 1,25.0, 50.0, 30.0, 20.0));

    Cliente cliente = new Cliente("Robson", "24114607080", new Data(10, 12, 1992),
            new Endereco("81330600", "Rua a", "41", "Paranavai", "Paraná"), "email@email.com.br");

    EntregaTest() throws Exception {
    }


    @Test
    void validaDataEntrega() {
        try {
            new Entrega(null, produtos, cliente, codigo );
        } catch (Exception e) {
            Assertions.assertEquals("java.lang.Exception: Data inválida", e.getMessage());
        }
    }

    @Test
    void validaListaDeProdutos() {
        try {
            new Entrega(dataEntrega, Collections.singletonList(null), cliente, codigo );
        } catch (Exception e) {
            Assertions.assertEquals("java.lang.Exception: Lista de produtos vazia", e.getMessage());
        }
    }

    @Test
    void validaCliente() {
        try {
            new Entrega(dataEntrega, produtos, null, codigo );
        } catch (Exception e) {
            Assertions.assertEquals("java.lang.Exception: Cliente inválido", e.getMessage());
        }
    }

    @Test
    void validaCodigo() {
        try {
            new Entrega(dataEntrega, produtos, cliente, null );
        } catch (Exception e) {
            Assertions.assertEquals("java.lang.Exception: Código inválido", e.getMessage());
        }
    }

}