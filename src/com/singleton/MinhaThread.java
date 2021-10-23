package com.singleton;

public class MinhaThread extends Thread{
    private String nome;

    public MinhaThread(String nome){
        this.nome = nome;
        start();
    }

    public void run(){
        Logger.INSTANCIA.LogCadProduto();
    }
}
