package com.hortfrutapp.view;
import java.util.Scanner;
import com.hortfrutapp.model.*;


public class CadastroProdutos {

		Scanner leiaStr = new Scanner (System.in);
		RetornosEErros retornos_e_erros = new RetornosEErros();

		public Fruta cadastrarFrutas() {
			boolean valido = false;
			double preco = 0.0;
			int quantidade = 0;
			double peso = 0.0;

			int id = Produto.getIdProduto();
			System.out.print("\nDigite o nome da Fruta: ");
			String nome = leiaStr.nextLine();

			while(!valido){
				System.out.print("Digite o Preço da Fruta (ex: 2.99): R$");
				String precoItem = leiaStr.nextLine();

				try {
					preco = Double.parseDouble(precoItem);
					valido = true;
				}catch (NumberFormatException e) {
					retornos_e_erros.erroDigiteNumero();
					System.out.println("");
					continue;
				}
			}

			valido = false;

			while(!valido){
			System.out.print("Digite a Quantidade de Frutas: ");
			String quantidadeItem = leiaStr.nextLine();

			try {
				quantidade = Integer.parseInt(quantidadeItem);
				valido = true;
			}catch (NumberFormatException e) {
				retornos_e_erros.erroDigiteNumero();
				System.out.println("");
				continue;
			}
			
			
			}

			valido = false;

			while(!valido){
				System.out.print("Digite o Peso da Fruta (em Kg): ");
				String pesoItem = leiaStr.nextLine();

				try {
					peso = Double.parseDouble(pesoItem);
					valido = true;
				}catch (NumberFormatException e) {
					retornos_e_erros.erroDigiteNumero();
					System.out.println("");
					continue;
				}
			}
			return new Fruta(id, nome, preco, quantidade, peso);
		}
		
		//=========================================================
			
		public Verdura cadastrarVerduras() {
			boolean valido = false;
			double preco = 0.0;
			int quantidade = 0;

			int id = Produto.getIdProduto();
			System.out.print("\nDigite o Nome da Verdura: ");
			String nome = leiaStr.nextLine();

			while(!valido){
				System.out.print("Digite o Preço da Fruta (ex: 2.99): R$");
				String precoItem = leiaStr.nextLine();

				try {
					preco = Double.parseDouble(precoItem);
					valido = true;
				}catch (NumberFormatException e) {
					retornos_e_erros.erroDigiteNumero();
					System.out.println("");
					continue;
				}
			}

			valido = false;

			while(!valido){
				System.out.print("Digite a Quantidade de Frutas: ");
				String quantidadeItem = leiaStr.nextLine();

				try {
					quantidade = Integer.parseInt(quantidadeItem);
					valido = true;
				}catch (NumberFormatException e) {
					retornos_e_erros.erroDigiteNumero();
					System.out.println("");
					continue;
				}
			}

			System.out.print("Digite o Tipo da Verdura: ");
			String tipo = leiaStr.nextLine();
			System.out.println("\n|| Verdura cadastrada com sucesso! ||");

			return new Verdura(id, nome, preco, quantidade, tipo);
		}
			
		//=========================================================
			
		public Tempero cadastrarTemperos() {
			boolean valido = false;
			double preco = 0.0;
			int quantidade = 0;

			int id = Produto.getIdProduto();
			System.out.print("\nDigite o Nome do Tempero: ");
			String nome = leiaStr.nextLine();
			while(!valido){
				System.out.print("Digite o Preço da Fruta (ex: 2.99): R$");
				String precoItem = leiaStr.nextLine();

				try {
					preco = Double.parseDouble(precoItem);
					valido = true;
				}catch (NumberFormatException e) {
					retornos_e_erros.erroDigiteNumero();
					System.out.println("");
					continue;
				}
			}

			valido = false;

			while(!valido){
				System.out.print("Digite a Quantidade de Frutas: ");
				String quantidadeItem = leiaStr.nextLine();

				try {
					quantidade = Integer.parseInt(quantidadeItem);
					valido = true;
				}catch (NumberFormatException e) {
					retornos_e_erros.erroDigiteNumero();
					System.out.println("");
					continue;
				}
			}

			System.out.print("Digite o Tipo do Tempero: ");
			String tipo = leiaStr.nextLine();
			System.out.println("\n|| Tempero cadastrado com sucesso! ||");
				
			return new Tempero(id, nome, preco, quantidade, tipo);
		}
}
