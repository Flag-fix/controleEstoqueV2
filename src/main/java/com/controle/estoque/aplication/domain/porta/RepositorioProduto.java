package com.controle.estoque.aplication.domain.porta;

import com.controle.estoque.aplication.domain.dados.ProdutoDTO;

import java.util.List;

public interface RepositorioProduto {


    public ProdutoDTO buscarDados(String nome);
}

