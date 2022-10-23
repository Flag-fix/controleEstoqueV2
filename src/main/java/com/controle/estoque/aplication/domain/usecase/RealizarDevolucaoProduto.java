package com.controle.estoque.aplication.domain.usecase;

import com.controle.estoque.aplication.domain.entity.Entrega;
import com.controle.estoque.aplication.domain.porta.RepositorioDevolucaoProduto;
import com.controle.estoque.aplication.domain.porta.RepositorioEnviaEmail;

public class RealizarDevolucaoProduto {
    RepositorioDevolucaoProduto realizarDevolucaoProduto;

    RepositorioEnviaEmail repositorioEnviaEmail;


    public void realizarDevolucaoProduto(String codigoEntrega) throws Exception {
        var entregaDTO = realizarDevolucaoProduto.buscarEntrega(codigoEntrega);
        var entrega = new Entrega(entregaDTO.getDataEntrega(), entregaDTO.getProdutos(), entregaDTO.getCliente(), entregaDTO.getCodigo());
        if (Boolean.TRUE.equals(entrega.getRecebido())) {
            if (entrega.verificarPeriodoDevolucao(entregaDTO.getDataEntrega(), 7)) {
                repositorioEnviaEmail.enviaEmailCliente(entrega.getCliente().getEmail(),
                        "Produto está no prazo de arrependimento, autorizado para devolução");
            }if (entrega.verificarPeriodoDevolucao(entregaDTO.getDataEntrega(), 30)) {
                repositorioEnviaEmail.enviaEmailCliente(entrega.getCliente().getEmail(),
                        "Produto está no prazo de 30 dias, será passada por uma análise do estado do produto");
            }
        } else {
            repositorioEnviaEmail.enviaEmailCliente(entrega.getCliente().getEmail(),
                    "Produto em rota de Entrega, devolução não permitida");
        }
    }
}