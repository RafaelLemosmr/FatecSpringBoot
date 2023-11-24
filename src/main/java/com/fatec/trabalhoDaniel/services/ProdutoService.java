package com.fatec.trabalhoDaniel.services;

import com.fatec.trabalhoDaniel.model.dto.ProdutoDTO;
import com.fatec.trabalhoDaniel.model.entity.Produto;
import com.fatec.trabalhoDaniel.model.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService
{
    @Autowired
    ProdutoRepository produtoRepository;

    public List<ProdutoDTO> getAllProdutos(){
        return produtoRepository.findAll().stream().map(produto -> new ProdutoDTO(produto.getId(), produto.getNome(),
                produto.getDescricao(), produto.getGrupo(), produto.getQuantidade())).toList();
    }

    public ProdutoDTO getProdutoID(Long id) {
        Optional<Produto> obj =  produtoRepository.findById(id);
        Produto produto = obj.get();
        return new ProdutoDTO(produto.getId(), produto.getNome(),
                produto.getDescricao(), produto.getGrupo(), produto.getQuantidade());
    }

    public ProdutoDTO addProduto(ProdutoDTO produtoDTO) {
        Produto produto = new Produto(produtoDTO.id(), produtoDTO.nome(), produtoDTO.descricao(), produtoDTO.grupo(), produtoDTO.quantidade());
        produtoRepository.save(produto);
        ProdutoDTO novoProduto = new ProdutoDTO(produto.getId(), produto.getNome(), produto.getDescricao(), produto.getGrupo(), produto.getQuantidade());
        return novoProduto;
    }

    public ProdutoDTO updateProduto(ProdutoDTO produtoDTO){
        Produto produto = new Produto(produtoDTO.id(), produtoDTO.nome(), produtoDTO.descricao(), produtoDTO.grupo(), produtoDTO.quantidade());
        produtoRepository.save(produto);
        ProdutoDTO novoProduto = new ProdutoDTO(produto.getId(), produto.getNome(), produto.getDescricao(), produto.getGrupo(), produto.getQuantidade());
        return novoProduto;
    }

    public void deleteProduto(Long id){
        if(produtoRepository.existsById(id)){
            produtoRepository.deleteById(id);
        }
    }

}
