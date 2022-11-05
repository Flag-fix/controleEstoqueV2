package com.controle.estoque.aplication.domain.usecase;

import com.controle.estoque.aplication.Utils;
import com.controle.estoque.aplication.domain.entity.Entrega;
import com.controle.estoque.aplication.domain.porta.RepositorioDevolucaoProduto;
import com.controle.estoque.aplication.domain.porta.RepositorioEnviaEmail;

import static com.controle.estoque.aplication.Utils.mensagemProdutoEmRotaEntrega;
import static com.controle.estoque.aplication.Utils.mensagemProdutoNoPrazoArrependimento;
import static com.controle.estoque.aplication.Utils.mensagemProdutoPrazo30Dias;

public class RealizarDevolucaoProduto {
    RepositorioDevolucaoProduto realizarDevolucaoProduto;

    RepositorioEnviaEmail repositorioEnviaEmail;

    Utils util;
    final String endereco = "Avenida Presidente Neves - 708 Jardim Campo Belo - Paranavaí PR 87701912";



    public String realizarDevolucaoProduto(String codigoEntrega) throws Exception {
        var entregaDTO = realizarDevolucaoProduto.buscarEntrega(codigoEntrega);
        var entrega = new Entrega(entregaDTO.getDataEntrega(), entregaDTO.getProdutos(), entregaDTO.getCliente(), entregaDTO.getCodigo());
        if (Boolean.TRUE.equals(entrega.getRecebido())) {
            if (Boolean.TRUE.equals(entrega.verificarPeriodoDevolucao(entregaDTO.getDataEntrega(), 7))) { // o 7 deve estar dentro de uma entidade,
                repositorioEnviaEmail.enviaEmailCliente(entrega.getCliente().getEmail(), mensagemProdutoNoPrazoArrependimento);
                return util.mensagemRetorno(mensagemProdutoNoPrazoArrependimento);
            }if (Boolean.TRUE.equals(entrega.verificarPeriodoDevolucao(entregaDTO.getDataEntrega(), 30))) {
                repositorioEnviaEmail.enviaEmailCliente(entrega.getCliente().getEmail(), mensagemProdutoPrazo30Dias);
                repositorioEnviaEmail.enviaEmailComDadosParaEntregaProduto(entrega.getCliente().getEmail(),endereco);
                return util.mensagemRetorno(mensagemProdutoPrazo30Dias);
            }
        } else {
            repositorioEnviaEmail.enviaEmailCliente(entrega.getCliente().getEmail(),mensagemProdutoEmRotaEntrega);
            return util.mensagemRetorno(mensagemProdutoEmRotaEntrega);
                    // >>>transparecer onde está o produto, notificar a transportadora
        }
        return util.mensagemRetorno(mensagemProdutoNoPrazoArrependimento);
    }
}