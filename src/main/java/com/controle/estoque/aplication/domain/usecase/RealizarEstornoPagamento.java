package com.controle.estoque.aplication.domain.usecase;

import com.controle.estoque.aplication.domain.entity.Entrega;
import com.controle.estoque.aplication.domain.porta.RepositorioEnviaEmail;
import com.controle.estoque.aplication.domain.porta.RepositorioEstornoProduto;

public class RealizarEstornoPagamento {
    RepositorioEstornoProduto repositorioEstornoProduto;

    RepositorioEnviaEmail repositorioEnviaEmail;

    public void realizarEstornoPagamento(Entrega entrega) {
        entrega.getProdutos().forEach(
                produto -> {
                    Boolean produtoAptoDevolucao = repositorioEstornoProduto.produtoAptoDevolucao(entrega.getCodigo());
                    if (produtoAptoDevolucao) {
                        repositorioEnviaEmail.enviaEmailCliente(entrega.getCliente().getEmail(),
                                "Produto foi danificado, não possível devolução");
                    } else {
                        repositorioEnviaEmail.enviaEmailCliente(entrega.getCliente().getEmail(),
                                "Devolução autorizada, valor a ser devolvido é "+ produto.getValorVenda());
                    }
                }

        );
    }
}
