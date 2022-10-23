package com.controle.estoque.aplication.domain.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {


     String SKU = "00001541";
     String nome = "produto";
     Integer quantidade = 10;
     Double taxaManutencao = 25.0;
     Double taxaInstalacao = 23.1;
     Double taxaSuporte = 27.9;
     Double taxaEquipamento= 32.9;


    @Test
    void validaSKU() {
        try {
            new Produto("", nome, quantidade, taxaManutencao, taxaInstalacao,taxaSuporte,taxaEquipamento);
        } catch (Exception e) {
            Assertions.assertEquals("java.lang.Exception: SKU inválido", e.getMessage());
        }
    }

    @Test
    void validaNome() {
        try {
            new Produto(SKU, null, quantidade, taxaManutencao, taxaInstalacao,taxaSuporte,taxaEquipamento);
        } catch (Exception e) {
            Assertions.assertEquals("java.lang.Exception: Nome inválido", e.getMessage());
        }
    }

    @Test
    void validaQuantidade() {
        try {
            new Produto(SKU, nome, -5, taxaManutencao, taxaInstalacao,taxaSuporte,taxaEquipamento);
        } catch (Exception e) {
            Assertions.assertEquals("java.lang.Exception: Quantidade inválida", e.getMessage());
        }
    }

    @Test
    void validaTaxaManutencao() {
        try {
            new Produto(SKU, nome, quantidade, -5.5, taxaInstalacao,taxaSuporte,taxaEquipamento);
        } catch (Exception e) {
            Assertions.assertEquals("java.lang.Exception: Taxa Manutenção inválido", e.getMessage());
        }
    }

    @Test
    void validaTaxaInstalacao() {
        try {
            new Produto(SKU, nome, quantidade, taxaManutencao, -5.5,taxaSuporte,taxaEquipamento);
        } catch (Exception e) {
            Assertions.assertEquals("java.lang.Exception: Taxa Instalação inválido", e.getMessage());
        }
    }

    @Test
    void validaTaxaSuporte() {
        try {
            new Produto(SKU, nome, quantidade, taxaManutencao, taxaInstalacao,-5.5,taxaEquipamento);
        } catch (Exception e) {
            Assertions.assertEquals("java.lang.Exception: Taxa Suporte inválido", e.getMessage());
        }
    }

    @Test
    void validaTaxaEquipamento() {
        try {
            new Produto(SKU, nome, quantidade, taxaManutencao, taxaInstalacao,taxaSuporte,-5.5);
        } catch (Exception e) {
            Assertions.assertEquals("java.lang.Exception: Taxa Equipamento inválido", e.getMessage());
        }
    }

}