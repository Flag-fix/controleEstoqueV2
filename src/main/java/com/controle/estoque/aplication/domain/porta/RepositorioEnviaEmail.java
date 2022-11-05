package com.controle.estoque.aplication.domain.porta;

public interface RepositorioEnviaEmail {

    void enviaEmailCliente (String email, String mensagem);

    void solicitaDadosBancarios (String email, String mensagem);

    void enviaEmailComDadosParaEntregaProduto (String email, String mensagem);
}
