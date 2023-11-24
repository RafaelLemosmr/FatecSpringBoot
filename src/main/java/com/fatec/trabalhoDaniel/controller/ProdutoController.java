package com.fatec.trabalhoDaniel.controller;

import com.fatec.trabalhoDaniel.model.dto.ProdutoDTO;
import com.fatec.trabalhoDaniel.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController
{

    @Autowired
    ProdutoService service;

    @GetMapping
    public ResponseEntity<List<ProdutoDTO>> getAllProdutos(){
        return ResponseEntity.ok(service.getAllProdutos());
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<ProdutoDTO> getProduto(@PathVariable Long id) {
        return ResponseEntity.ok().body(service.getProdutoID(id));
    }

    @PostMapping
    public ResponseEntity<ProdutoDTO> addProduto(@RequestBody ProdutoDTO produtoDTO){
        return ResponseEntity.ok().body(service.addProduto(produtoDTO));
    }

    @PutMapping
    public ProdutoDTO updateProduto(@RequestBody ProdutoDTO produtoDTO){
        return service.updateProduto(produtoDTO);
    }

    @DeleteMapping
    public void deleteProduto(@PathVariable Long id){
        service.deleteProduto(id);
    }

}
