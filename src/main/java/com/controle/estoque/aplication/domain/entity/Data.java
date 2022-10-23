package com.controle.estoque.aplication.domain.entity;

import java.util.Calendar;
import java.util.Date;

public class Data {

    private Integer dia;
    private Integer mes;
    private Integer ano;

    public Data() {
    }

    public Data(Integer dia, Integer mes, Integer ano) throws Exception {
        try {
            if (dia == null || dia > 32 || dia <= 0) {
                throw new Exception("Dia inválido");
            }
            if (mes == null || mes > 12 || mes <= 0) {
                throw new Exception("Mes inválido");
            }
            if (ano == null || ano <= 1900) {
                throw new Exception("Ano inválido");
            }
        } catch (Exception e) {
            throw new Exception(e);
        }
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data pegaDataAtual(){
        var data = new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(data);
        var dataAtual = new Data();
        dataAtual.setDia(cal.get(Calendar.DAY_OF_MONTH));
        dataAtual.setMes(cal.get(Calendar.MONTH));
        dataAtual.setAno(cal.get(Calendar.YEAR));
        return dataAtual;
    }

    public Integer getDia() {
        return dia;
    }

    public void setDia(Integer dia) {
        this.dia = dia;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
}
