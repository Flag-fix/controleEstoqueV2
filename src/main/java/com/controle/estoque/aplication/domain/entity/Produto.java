package com.controle.estoque.aplication.domain.entity;

public class Produto {

    private String nome;
    private Integer quantidade;
    private Double taxaManutencao;
    private Double taxaInstalacao;
    private Double taxaSuporte;
    private Double taxaEquipamento;
    private ValorVenda valorVenda;

    public Produto(String nome, Integer quantidade, Double taxaManutencao, Double taxaInstalacao, Double taxaSuporte, Double taxaEquipamento) throws Exception {
        try {
            if(nome==null || nome == "") {
                throw new Exception("Nome inválido");
            }
            if(quantidade<=0 || quantidade == null ) {
                throw new Exception("Quantidade inválida");
            }
            if (taxaManutencao <=0 || taxaManutencao == null) {
                throw new Exception("Taxa Manutenção inválido");
            }
            if (taxaInstalacao <=0 || taxaInstalacao == null) {
                throw new Exception("Taxa Instalação inválido");
            }
            if (taxaSuporte <=0 || taxaSuporte == null) {
                throw new Exception("Taxa Suporte inválido");
            }
            if (taxaEquipamento <=0 || taxaEquipamento == null) {
                throw new Exception("Taxa Equipamento inválido");
            }
        } catch(Exception e) {
            return;
        }

        ValorVenda valorVenda = new ValorVenda();

        if(taxaManutencao>50){
            valorVenda.setMultiplo(valorVenda.getMultiplo()+0.2);
        }
        if(taxaInstalacao>100){
            valorVenda.setMultiplo(valorVenda.getMultiplo()+0.2);
        }

        valorVenda.setValorFinal(valorVenda.getMultiplo()*100);

        this.nome = nome;
        this.quantidade = quantidade;
        this.taxaManutencao = taxaManutencao;
        this.taxaInstalacao = taxaInstalacao;
        this.taxaSuporte = taxaSuporte;
        this.taxaEquipamento = taxaEquipamento;
        this.valorVenda = valorVenda;
    }

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

    public ValorVenda getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(ValorVenda valorVenda) {
        this.valorVenda = valorVenda;
    }
}

