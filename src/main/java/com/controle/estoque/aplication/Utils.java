package com.controle.estoque.aplication;

public class Utils {

    public static String mensagemProdutoPrazo30Dias = "Produto está no prazo de 30 dias, será passada por uma análise do estado do produto, " +
            "A análise demora 5 dias úteis a partir da data do recebimento do produto." +
            " Após a análise estar completa, será enviado um e-mail com o parecer técnico. " +
            "Atenciosamente, Controle_EstoqueV2";

    public static String mensagemProdutoNoPrazoArrependimento = "Produto está no prazo de arrependimento, autorizado para devolução. Atenciosamente, Controle_EstoqueV2";
    public static String mensagemProdutoEmRotaEntrega = "Produto em rota de Entrega, devolução não permitida. Atenciosamente, Controle_EstoqueV2";

    public String mensagemRetorno(String mensagem){
        return mensagem;
    }

}
