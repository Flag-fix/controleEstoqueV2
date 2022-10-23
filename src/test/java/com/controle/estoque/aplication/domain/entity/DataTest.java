package com.controle.estoque.aplication.domain.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DataTest {

    Integer dia = 12;
    Integer mes = 4;
    Integer ano = 2022;


    @Test
    void validaDia() {
        try {
            new Data(null, mes, ano);
        } catch (Exception e) {
            Assertions.assertEquals("java.lang.Exception: Dia inválido", e.getMessage());
        }
    }

    @Test
    void validaMes() {
        try {
            new Data(dia, null, ano);
        } catch (Exception e) {
            Assertions.assertEquals("java.lang.Exception: Mes inválido", e.getMessage());
        }
    }

    @Test
    void validaAno() {
        try {
            new Data(dia, mes, null);
        } catch (Exception e) {
            Assertions.assertEquals("java.lang.Exception: Ano inválido", e.getMessage());
        }
    }

}