package com.controle.estoque.aplication.domain.usecase;

import com.controle.estoque.aplication.domain.porta.RepositorioEntregaProduto;
import com.controle.estoque.aplication.domain.porta.RepositorioEnviaEmail;

public class NotificaEntrega {
    RepositorioEntregaProduto repositorioProduto;

    RepositorioEnviaEmail repositorioEnviaEmail;

    public void buscaStatusEntrega(String codigo, String emailCliente){
        Boolean extravio =  repositorioProduto.verificaExtravio(codigo);
        if( extravio == true){
            repositorioEnviaEmail.enviaEmailCliente(emailCliente, "Produto extraviado");
        }else{
            repositorioEnviaEmail.enviaEmailCliente(emailCliente, "Produto em rota de Entrega");
        }
    }
}
