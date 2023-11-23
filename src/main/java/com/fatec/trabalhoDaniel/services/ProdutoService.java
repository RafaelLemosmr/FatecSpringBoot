package com.fatec.trabalhoDaniel.services;

import com.fatec.trabalhoDaniel.model.dto.ProdutoDTO;
import com.fatec.trabalhoDaniel.model.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService
{
    @Autowired
    ProdutoRepository produtoRepository;

    public List<ProdutoDTO> getAllProdutos(){
        return produtoRepository.findAll().stream().map(produto -> new ProdutoDTO(produto.getId(), produto.getNome(),
                produto.getDescricao(), produto.getGrupo(), produto.getQuantidade())).toList();
    }

}
