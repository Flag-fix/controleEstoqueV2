package com.controle.estoque.aplication.domain.entity;

public class DadosEntrega {

    private String codigo;
    private String logradouro;
    private Boolean estraviado;

    public DadosEntrega(String codigo) throws Exception {
        if(codigo==null){
            throw new Exception("Codigo com erro");
        }
        this.codigo = codigo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }


    public Boolean getEstraviado() {
        return estraviado;
    }

    public void setEstraviado(Boolean estraviado) {
        this.estraviado = estraviado;
    }
}
