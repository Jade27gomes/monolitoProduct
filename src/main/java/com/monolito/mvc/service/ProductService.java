package com.monolito.mvc.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;

import com.monolito.mvc.database.dto.ProdutoDTO;
import com.monolito.mvc.database.model.Produto;
@Service
public class ProductService {
    
    private static final List<Produto> PRODUTOS = new ArrayList<>();
        
    static {
        // lista com dados mocados
        PRODUTOS.add(Produto.builder().id(1).nome("Produto 1").preco(10.0).quantidade(10).build());
        PRODUTOS.add(Produto.builder().id(2).nome("Produto 2").preco(20.0).quantidade(10).build());
        PRODUTOS.add(Produto.builder().id(3).nome("Produto 3").preco(30.0).quantidade(10).build());
        }

    public List<Produto> findAll() {
        return new ArrayList<>(PRODUTOS);
    }

    public Produto createProduto(ProdutoDTO produtoDTO){
       
        Integer incremento = PRODUTOS.stream()
            .mapToInt(Produto::getId)
            .max()
            .orElse(0) + 1;

        Produto novoProduto = Produto.builder()
            .id(incremento)
            .nome(produtoDTO.getNome())
            .descricao(produtoDTO.getDescricao())
            .preco(produtoDTO.getPreco())
            .quantidade(produtoDTO.getQuantidade())
            .build();

        PRODUTOS.add(novoProduto);
        return novoProduto;
    }

    public Produto atualizarProduto(ProdutoDTO produtoDTO, Integer id){
       
        Produto produtoExistente = PRODUTOS.stream()
            .filter(p -> p.getId().equals(id))
            .findFirst()
            .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

            produtoExistente.setNome(produtoDTO.getNome());
            produtoExistente.setDescricao(produtoDTO.getDescricao());
            produtoExistente.setPreco(produtoDTO.getPreco());
            produtoExistente.setQuantidade(produtoDTO.getQuantidade()); 
        
        return produtoExistente;
    }

    public void deletarProduto(Integer id) {
        PRODUTOS.removeIf(p -> p.getId().equals(id));
    }
}