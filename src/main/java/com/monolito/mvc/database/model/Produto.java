package com.monolito.mvc.database.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


// Usando Lombok para gerar construtor, getters e setters via decorator
@Getter
@Setter
@ToString
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor


public class Produto{
    private Integer id;
    private String nome;
    private String descricao;
    private double preco;
    private int quantidade;

    // public Produto (Id id, String nome, String descricao, double preco) {
    //     this.id = id;
    //     this.nome = nome;
    //     this.descricao = descricao;
    //     this.preco = preco;
    // }

    // public Long getID() {
    //     return id;
    // }   
    // public String getName(){
    //     return nome;
    // }
    // public String getDescricao() {
    //     return descricao;
    // }
    // public double getPreco() {
    //     return preco;
    // }

    // public void setID(Long id) {
    //     this.id = id;
    // }
    // public void setName(String nome) {
    //     this.nome = nome;
    // }
    // public void setDescricao(String descricao) {
    //     this.descricao = descricao;
    // }
    // public void setPreco(double preco) {
    //     this.preco = preco;
    // }
}