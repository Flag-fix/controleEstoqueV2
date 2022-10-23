package com.controle.estoque.aplication.domain.porta;

import com.controle.estoque.aplication.domain.dto.ProdutoDTO;

public interface RepositorioProduto {


    ProdutoDTO buscarDados(String nome);
}

