package com.teste.primeiroexemplo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.teste.primeiroexemplo.model.Produto;
import com.teste.primeiroexemplo.repository.ProdutoRepository;

@Service 

public class ProdutoService{
    
    @Autowired 
    private ProdutoRepository produtoRepository;
    
    /**
     * Metodo para retornar uma lista de produtos.
     * @return Lista de produtos.
     */
    public List<Produto> obterTodos(){
       // Colocar regra de negócios aqui.
        return produtoRepository.obterTodos();
            }
        
    /**
    * Metodo que retorna o produto encontrado pelo seu Id).
    * @param id do produto que sera  encontrado. 
    * @return Retorna o produto encontrado. 
     */
    public Optimal<Produto> obterPorId(Integer id){
        return produtoRepository.obterPorId(id);   
    }


     /**
     * Metodo que retorna o produto que sera adicionadio na lista.
     * @param produto do produto que sera adicionado.
     * @return Retorna o produto que foi adicionado na lista.
     */
    public Produto adicionar(Produto produto ){
        // Colocar regra de negocios para validar o produto (\idf, nome, quantidade, valor, ...).
        return produtoRepository.adicionar(produto);
    }    


   
    /**
     * Metodo para deletar o produto encontrado por Id.
     * @param id do produto a ser deletado.
     */
    public void deletar(Integer id){
        // Colocar rfegra de negócios para validação.
        produtoRepository.deletar(id);
    }
 
  /**
     * Metodo para atualizar o produto na lista.
     * @param produto que sera atualizado.
     * @return Retorna o produto apos atualizar a lista.
     */
    public Produto atualizar(Integer id, Produto produto){
        // Colocar regra de negócios para validação do produto.
        produto.setId(id);        
        return produtoRepository.atualizar(produto);
    }
    
}