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
                                "Produto foi danificado, não possível devolução." +
                                        " Será enviado um e-mail com a avaliação técnica dos detalhes do produto. " +
                                        "Atenciosamente, Controle_EstoqueV2");

                    } else {
                        repositorioEnviaEmail.enviaEmailCliente(entrega.getCliente().getEmail(),
                                "Devolução do pagamento autorizada, valor a ser devolvido é "+ produto.getValorVenda() +
                                "\n Será enviado um email com a solicitação dos dados bancários para extorno. " +
                                        "Obrigado por entrar em contato conosco.");
                                repositorioEnviaEmail.solicitaDadosBancarios(entrega.getCliente().getEmail(),
                                        "Para darmos continuidade no extorno é necessário que informe: " +
                                        "Agência: \n" +
                                        "Conta corrente:\n " +
                                                "Conta poupança ou corrente:\n" +
                                                "Atenciosamente, Controle_EstoqueV2.");
                    }
                }
        );
    }
}
