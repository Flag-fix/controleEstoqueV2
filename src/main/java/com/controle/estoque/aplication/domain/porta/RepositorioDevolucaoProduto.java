package com.controle.estoque.aplication.domain.porta;

import com.controle.estoque.aplication.domain.dto.EntregaDTO;

public interface RepositorioDevolucaoProduto {


    EntregaDTO buscarEntrega(String codigo);
}

