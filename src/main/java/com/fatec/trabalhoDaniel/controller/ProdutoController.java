package com.fatec.trabalhoDaniel.controller;

import com.fatec.trabalhoDaniel.model.dto.ProdutoDTO;
import com.fatec.trabalhoDaniel.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}
