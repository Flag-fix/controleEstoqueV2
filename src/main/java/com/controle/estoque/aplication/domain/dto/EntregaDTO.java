package com.controle.estoque.aplication.domain.dto;

import com.controle.estoque.aplication.domain.entity.Cliente;
import com.controle.estoque.aplication.domain.entity.Data;
import com.controle.estoque.aplication.domain.entity.Produto;

import java.util.List;

public class EntregaDTO {
    private String codigo;

    private Data dataEntrega;

    private List<Produto> produtos;

    private Cliente cliente;

    private Boolean recebido;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Data getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Data dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Boolean getRecebido() {
        return recebido;
    }

    public void setRecebido(Boolean recebido) {
        this.recebido = recebido;
    }
}
