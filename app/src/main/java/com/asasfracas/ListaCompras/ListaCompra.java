package com.asasfracas.ListaCompras;

public class ListaCompra {

    private String novaLista;
    private int idLista;

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

    public int getId() {
        return idLista;
    }

    public void setId(int id) {
        this.idLista = id;
    }
}
