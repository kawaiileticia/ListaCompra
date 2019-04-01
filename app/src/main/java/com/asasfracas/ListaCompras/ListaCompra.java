package com.asasfracas.ListaCompras;

public class ListaCompra {

    private String novaLista;

    @Override
    public String toString() {
        return this.novaLista + "\n" + this.novaLista;

    }

    public String getNovaLista() {
        return novaLista;
    }

    public void setNovaLista(String novaLista) {
        this.novaLista = novaLista;
    }
}
