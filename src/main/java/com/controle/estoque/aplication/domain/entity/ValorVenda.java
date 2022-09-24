package com.controle.estoque.aplication.domain.entity;

public class ValorVenda {

    private Double valorFinal;
    private Double multiplo;

    public ValorVenda( ) {
        this.multiplo=1.0;
        this.valorFinal=0.0;
    }

    public Double getValorFinal() {
        return valorFinal;
    }

    public void setValorFinal(Double valorFinal) throws Exception {
        if(valorFinal <=0){
            throw new Exception("Erro, valor inválido");
        }
        this.valorFinal = valorFinal;
    }

    public Double getMultiplo() {
        return multiplo;
    }

    public void setMultiplo(Double multiplo) {
        this.multiplo = multiplo;
    }


}
