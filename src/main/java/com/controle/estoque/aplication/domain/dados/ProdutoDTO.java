package com.controle.estoque.aplication.domain.dados;

import com.controle.estoque.aplication.domain.entity.ValorVenda;

public class ProdutoDTO
{
    private String nome;
    private Integer quantidade;
    private Double taxaManutencao;
    private Double taxaInstalacao;
    private Double taxaSuporte;
    private Double taxaEquipamento;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(Double taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }

    public Double getTaxaInstalacao() {
        return taxaInstalacao;
    }

    public void setTaxaInstalacao(Double taxaInstalacao) {
        this.taxaInstalacao = taxaInstalacao;
    }

    public Double getTaxaSuporte() {
        return taxaSuporte;
    }

    public void setTaxaSuporte(Double taxaSuporte) {
        this.taxaSuporte = taxaSuporte;
    }

    public Double getTaxaEquipamento() {
        return taxaEquipamento;
    }

    public void setTaxaEquipamento(Double taxaEquipamento) {
        this.taxaEquipamento = taxaEquipamento;
    }


}
