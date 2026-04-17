package com.monolito.mvc.controller;

import org.springframework.web.bind.annotation.RestController;

import com.monolito.mvc.database.dto.ProdutoDTO;
import com.monolito.mvc.database.model.Produto;
import com.monolito.mvc.service.ProductService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/produtos")
@RequiredArgsConstructor
public class productControler {

    private final ProductService productService;

    @GetMapping("")
    @ResponseStatus(HttpStatus.OK)
    public List<Produto>findAll(){
        return productService.findAll();
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public Produto createPrtoduto(@RequestBody ProdutoDTO produtoDTO){
        return productService.createProduto(produtoDTO);
    }

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public Produto atualizarProduto(@PathVariable Integer id, @RequestBody ProdutoDTO produtoDTO) {
        return productService.atualizarProduto(produtoDTO, id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarProduto(@PathVariable Integer id) {
        productService.deletarProduto(id);
    }
}   