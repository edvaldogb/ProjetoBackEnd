package com.teste.primeiroexemplo.model;

//#region
public class Produto {
     
private integer id;

private string nome;

private integer quantidade;

private Double valor;

private string observacao;

//#endregion Attributes

//#region Getters and Setters

public integer getId() {
    return id;
}

public void setId(integer id) {
    this.id = id;
}

public string getNome() {
    return nome;
}

public void setNome(string nome) {
    this.nome = nome;
}

public integer getQuantidade() {
    return quantidade;
}

public void setQuantidade(integer quantidade) {
    this.quantidade = quantidade;
}

public Double getValor() {
    return valor;
}

public void setValor(Double valor) {
    this.valor = valor;
}

public string getObservacao() {
    return observacao;
}

public void setObservacao(string observacao) {
    this.observacao = observacao;
}

//#endregion Getters and Stters

}
