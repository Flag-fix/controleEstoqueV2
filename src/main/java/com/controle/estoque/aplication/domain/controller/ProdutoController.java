package com.controle.estoque.aplication.domain.controller;


import com.controle.estoque.aplication.domain.dto.EntregaDTO;
import com.controle.estoque.aplication.domain.usecase.RealizarDevolucaoProduto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/produto")
@Tag(name = "Produto", description = "Operação relacioada a persistencia de produtos")
public class ProdutoController {


    @Operation(description = "Salva Produto no banco de dados")
    @PostMapping("/realizar-devolucao")
    public ResponseEntity<String> entradaProduto(@RequestBody @Valid EntregaDTO entregaDTO) throws Exception {
        RealizarDevolucaoProduto realizarDevolucaoProduto = new RealizarDevolucaoProduto();
        return ResponseEntity.status(HttpStatus.OK).body(realizarDevolucaoProduto.realizarDevolucaoProduto(entregaDTO.getCodigo()));
    }


}
