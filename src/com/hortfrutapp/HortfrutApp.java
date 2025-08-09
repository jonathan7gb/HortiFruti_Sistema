package com.hortfrutapp;

import com.hortfrutapp.view.*;
import com.hortfrutapp.service.*;

public class HortfrutApp {

    public static void main(String[] args) {
        Menus menu = new Menus();
        CadastroProdutos cadastro_produtos = new CadastroProdutos();
        RemocaoProdutos remocao_produtos = new RemocaoProdutos();
        RetornosEErros retornos_e_erros = new RetornosEErros();
        MensagemSaida mensagem_saida = new MensagemSaida();
        EdicaoProdutos edicao_produtos = new EdicaoProdutos();
        Estoque estoque = new Estoque();
        int opcaoMenu = 0;

        do {
            opcaoMenu = menu.menu();

            if (opcaoMenu >= 1 && opcaoMenu <= 4) {
                estoque.gerenciadorApp(opcaoMenu, menu, cadastro_produtos, mensagem_saida, retornos_e_erros, remocao_produtos, edicao_produtos);
            } else if (opcaoMenu == 0) {
                mensagem_saida.encerrando();
            } else {
            	retornos_e_erros.erroOpcaoInvalida();
            }
        } while (opcaoMenu != 0);
    }
}