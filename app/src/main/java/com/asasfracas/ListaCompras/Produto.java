package com.asasfracas.ListaCompras;

import android.text.Editable;

public class Produto {

    private int id, preco, quantidade;
    private String produto;

    @Override
    public String toString() {
        return this.produto + "\n" + this.produto;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void setQuantidade(Editable text) {
    }

    public void setPreco(String s) {
    }
}