package com.controle.estoque.aplication.domain.usecase;

import com.controle.estoque.aplication.domain.entity.Produto;
import com.controle.estoque.aplication.domain.porta.RepositorioProduto;

public class CalcularPrecoVenda {
    RepositorioProduto repositorioProduto;

    public Double calculaPrecoVenda(String nomeProduto) throws Exception {
        var produtoDTO = repositorioProduto.buscarDados(nomeProduto);

        var produto = new Produto(produtoDTO.getSKU(), produtoDTO.getNome(), produtoDTO.getQuantidade(), produtoDTO.getTaxaManutencao(), produtoDTO.getTaxaInstalacao(), produtoDTO.getTaxaSuporte(), produtoDTO.getTaxaEquipamento());
        return produto.getValorVenda().getValorFinal();
    }
}

