package com.singleton;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("\nEXEMPLO DE UTILIZAÇÃO DE SINGLETON PARA GERAÇÃO DE LOG");
            System.out.println("UTILIZANDO THREAD");

            System.out.println("\nPara exemplificar o cadastro de um produto, digite qualquer número: ");

            String escolha = scanner.next();

            try {
                int escolhaProduto = Integer.parseInt(escolha);

                MinhaThread threadCadProduto = new MinhaThread("Thread de Cadastro de Produto");

            } catch (NumberFormatException e) {
                System.out.println("Digite um número, por favor.");
            }
        }
    }

