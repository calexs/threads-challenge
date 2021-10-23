package com.singleton;

public class Logger {

    public static final Logger INSTANCIA = new Logger();
    private Logger() {
    }

    public void LogCadProduto() {
        System.out.println("Produto cadastrado. OBRIGADO!");
    }
}
