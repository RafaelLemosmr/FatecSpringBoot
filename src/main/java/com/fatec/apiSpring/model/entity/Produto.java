package com.fatec.apiSpring.model.entity;

import jakarta.persistence.*;

@Table(name = "produtos")
@Entity
public class Produto
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nome;
    @Column
    private String descricao;
    @Column
    private String grupo;
    @Column
    private int quantidade;

    public Produto() {
    }

    public Produto(Long id, String nome, String descricao, String grupo, int quantidade) {
        this.nome = nome;
        this.descricao = descricao;
        this.grupo = grupo;
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}

