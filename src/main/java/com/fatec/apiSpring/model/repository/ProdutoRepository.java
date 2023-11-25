package com.fatec.apiSpring.model.repository;

import com.fatec.apiSpring.model.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
