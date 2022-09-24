package com.controle.estoque.aplication;

import com.controle.estoque.hexagonal.infraestrutura.adaptadores.repositories.SpringProdutoRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = SpringProdutoRepository.class)
public class ControleEstoqueV2Application {

    public static void main(String[] args) {
        SpringApplication.run(ControleEstoqueV2Application.class, args);
    }

}
