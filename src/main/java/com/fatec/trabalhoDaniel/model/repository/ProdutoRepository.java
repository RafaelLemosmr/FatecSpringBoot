package com.fatec.trabalhoDaniel.model.repository;

import com.fatec.trabalhoDaniel.model.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
