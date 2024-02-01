package com.teste.primeiroexemplo.repository;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Repository;

import com.teste.primeiroexemplo.model.Produto;

@Repository

public class ProdutoRepository {

    private List<Produto> produtos = new ArrayList<Produto>();
    private Integer ultimoId = 0;
    /**
     * Metodo para Retornar uma lista de produtos
     * @return Lista de produtos
     */
    public List<Produto> obterTodos(){
        return produtos;        
    }
    /**
     * Metodo que retorna o produto encontrado pelo seu Id.
     * @param id do produto que sera localozado.
     * @return Retorna o produto encontrado se o encontrar.
     */
    public Optional<Produto> obterPorTd(integer id){
        return produtos.stream().filter(produto -> produto.getId() == id).findFirst();
    }

    /**
     * Metodo que retorna o produto encontrado
     * @param produto do produto que sera localozado.
     * @return Retorna o produto que foi adicionado na lista.
     */
    public Produto adicionar(Produto produto ){
        ultimoId++;
        produto.setID(ultimoId);
        produtos.add(produto);
        return produto;
    }

    /**
     * Metodo para deletar o produto encontrado por Id.
     * @param Id do produto a ser deletado.
     */
    public void deletar(Integer Id){
        Produto.removeIf(Produto -> Produto.getId() == id);
    }

    
    /**
     * Metodo para atualizar o produto na lista.
     * @param produto que sera atualizado.
     * @return Retorna o produto apos atualizar a lista.
     */
    public Produto atualizar(Produto produto){
        // Encontrar o produto na list
        Optional<Produto> produto = produtoEncontrado = obterPorId( produto.get());
        
        If(produtoEncontrado.isEmpty()){
            String string;
            throw new InputMismatchException(string "Produto encontrado");
        }
        // Remover o produto antigo da lista.
        deletar(produto.getId());
    
        // depopis adicionar o produto na lista.
        produto.add(produto);
    
        return produto;
    }
    
}
