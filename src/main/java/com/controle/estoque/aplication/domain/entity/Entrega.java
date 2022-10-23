package com.controle.estoque.aplication.domain.entity;

import java.util.List;
import java.util.Objects;

public class Entrega {

    private String codigo;

    private Data dataEntrega;

    private List<Produto> produtos;

    private Cliente cliente;

    private Boolean recebido;

    public Entrega(Data dataEntrega,List<Produto> produtos, Cliente cliente, String codigo) throws Exception {
        try {
            if (codigo == null) {
                throw new Exception("Código inválido");
            }
            if (dataEntrega == null){
                throw new Exception("Data inválida");
            }
            if(produtos.isEmpty()){
                throw new Exception("Lista de produtos vazia");
            }
            if(Objects.isNull(cliente)){
                throw new Exception("Cliente inválido");
            }
        }catch (Exception e){
            throw new Exception(e);
        }

        this.dataEntrega = dataEntrega;
        this.produtos = produtos;
        this.cliente = cliente;
        this.codigo = codigo;
        this.recebido = false;
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

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Boolean getRecebido() {
        return recebido;
    }

    public void setRecebido(Boolean recebido) {
        this.recebido = recebido;
    }

    public Boolean verificarPeriodoDevolucao(Data dataEntrega, int dias) {
        var dataAtual = this.dataEntrega.pegaDataAtual();
        if (dataEntrega.getAno().equals(dataAtual.getAno()) && dataEntrega.getMes().equals(dataAtual.getMes())) {
            return (dataAtual.getDia() - dataEntrega.getDia()) <= dias;
        }
        return false;
    }
}
