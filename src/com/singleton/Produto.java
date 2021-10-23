package com.singleton;

public class Produto {

    public Produto(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    private int codigo;
    public String nome;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
