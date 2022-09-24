package com.controle.estoque.aplication.domain.porta;

public interface RepositorioEnviaEmail {

    void enviaEmailCliente (String email, String mensagem);
}
