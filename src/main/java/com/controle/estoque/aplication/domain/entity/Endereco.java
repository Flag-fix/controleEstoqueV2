package com.controle.estoque.aplication.domain.entity;

public class Endereco {
    private String cep;
    private String logradouro;
    private String numero;
    private String cidade;
    private String estado;

    public Endereco(){}

    public Endereco(String cep, String logradouro, String numero, String cidade, String estado) throws Exception {
        try {
            if (cep == null || cep.length() > 8){
                throw new Exception("Cep inválido");
            }
            if(logradouro == null){
                throw new Exception("Logradouro inválido");
            }
            if(numero == null){
                throw new Exception("Número inválido");
            }
            if(cidade == null){
                throw new Exception("Cidade inválido");
            }
            if(estado == null){
                throw new Exception("Estado inválido");
            }
        }catch (Exception e){
            throw new Exception(e);
        }

        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
