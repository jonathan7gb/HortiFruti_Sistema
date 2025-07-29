package com.hortfrutapp.view;
import com.hortfrutapp.model.*;

import java.util.Scanner;

public class Atendente {
	Scanner leiaStr = new Scanner (System.in);
	Scanner leiaNum = new Scanner (System.in);

			public int menu () {
			
				System.out.println("\n||   HORTIFRUTI SISTEMA   ||");
				System.out.println("|| 1 - Cadastrar Produto  ||");
				System.out.println("|| 2 - Listar Produto     ||");
				System.out.println("|| 3 - Remover Produto    ||");
				System.out.println("|| 4 - Total de Produtos  ||");
				System.out.println("|| 0 - Sair do Sistema    ||");
				System.out.println("|| ====================== ||");
				System.out.print("|| Sua escolha: ");
				int opcao = leiaNum.nextInt();
				return opcao;
			}
			
			public int menuCadastro() {
				System.out.println("\n|| Cadastrar Produto     ||");
				System.out.println("|| ===================== ||");
				System.out.println("|| 1 - Cadastrar Fruta   ||");
				System.out.println("|| 2 - Cadastrar Verdura ||");
				System.out.println("|| 3 - Cadastrar Tempero ||");
				System.out.println("|| ===================== ||");
				System.out.print("|| Sua escolha: ");
				int opcao = leiaNum.nextInt();
				return opcao;
			}

			public Fruta cadastrarFrutas() {
				int id = Produto.getIdProduto();
				System.out.print("\nDigite o nome da Fruta: ");
				String nome = leiaStr.nextLine();
				System.out.print("Digite o Preço da Fruta: ");
				double preco = leiaNum.nextDouble();
				System.out.print("Digite a Quantidade de Frutas: ");
				int quantidade = leiaNum.nextInt();
				System.out.print("Digite o Peso da Fruta (em Kg): ");
				double peso = leiaNum.nextDouble();
				System.out.println("\n|| Fruta cadastrada com sucesso! ||");

				return new Fruta(id, nome, preco, quantidade, peso);
			}
		
			public Verdura cadastrarVerduras() {
				int id = Produto.getIdProduto();
				System.out.print("\nDigite o Nome da Verdura: ");
				String nome = leiaStr.nextLine();
				System.out.print("Digite o Preço da Verdura: ");
				double preco = leiaNum.nextDouble();
				System.out.print("Digite a Quantidade de Verduras: ");
				int quantidade = leiaNum.nextInt();
				System.out.print("Digite o Tipo da Verdura: ");
				String tipo = leiaStr.nextLine();
				System.out.println("\n|| Verdura cadastrada com sucesso! ||");

				return new Verdura(id, nome, preco, quantidade, tipo);
			}
			
			public Tempero cadastrarTemperos() {
				int id = Produto.getIdProduto();
				System.out.print("\nDigite o Nome do Tempero: ");
				String nome = leiaStr.nextLine();
				System.out.print("Digite o Preço do Tempero: ");
				double preco = leiaNum.nextDouble();
				System.out.print("Digite a Quantidade do Tempero: ");
				int quantidade = leiaNum.nextInt();
				System.out.print("Digite o Tipo do Tempero: ");
				String tipo = leiaStr.nextLine();
				System.out.println("\n|| Tempero cadastrado com sucesso! ||");
				
				return new Tempero(id, nome, preco, quantidade, tipo);
			}
			
			
			public int menuLista() {
				System.out.println("\n||      Listar Produtos      ||");
				System.out.println("|| ========================= ||");
				System.out.println("|| 1 - Listar Frutas         ||");
				System.out.println("|| 2 - Listar Verduras       ||");
				System.out.println("|| 3 - Listar Temperos       ||");
				System.out.println("|| 4 - Listar Todos Produtos ||");
				System.out.println("|| ========================= ||");
				System.out.print("|| Sua escolha: ");
				int opcao = leiaNum.nextInt();
				return opcao;
			}

			public void listarProdutos(Produto produto) {
				System.out.println(produto);
			}


			public void produtoN() {
				System.out.println("\n|| Nenhum Produto cadastrado! ||");
			}
			
			public void frutaN() {
				System.out.println("|| Nenhuma Fruta cadastrada! ||");
			}
						
			public void verduraN() {
				System.out.println("|| Nenhuma Verdura cadastrada! ||");
			}
			
			public void temperoN() {
				System.out.println("|| Nenhum Tempero cadastrado! ||");
			}

			
			public int menuRemover() {
				System.out.println("\n||       Remover Produtos        ||");
				System.out.println("|| ============================= ||");
				System.out.println("|| 1 - Remover Fruta             ||");
				System.out.println("|| 2 - Remover Verdura           ||");
				System.out.println("|| 3 - Remover Tempero           ||");
				System.out.println("|| ============================= ||");
				System.out.println("|| 4 - Remover todas as Frutas   ||");
				System.out.println("|| 5 - Remover todas as Verduras ||");
				System.out.println("|| 6 - Remover todos os Temperos ||");
				System.out.println("|| ============================= ||");
				System.out.println("|| 7 - Remover Todos Produtos    ||");
				System.out.println("|| ============================= ||");
				System.out.print("|| Sua escolha: ");
				int opcao = leiaNum.nextInt();
				return opcao;
			}
			
			public int menuRemoverFrutas() {
				System.out.println("\n|| Você tem certeza que deseja remover todas as frutas do estoque? |");
				System.out.println("|| 1 - Sim");
				System.out.println("|| 2 - Não");
				System.out.println("|| ===============");
				System.out.print("|| Sua escolha: ");
				int opcao = leiaNum.nextInt();
				return opcao;
			}
			
			public int menuRemoverVerduras() {
				System.out.println("\n|| Você tem certeza que deseja remover todas as verduras do estoque? |");
				System.out.println("|| 1 - Sim");
				System.out.println("|| 2 - Não");
				System.out.println("|| ===============");
				System.out.print("|| Sua escolha: ");
				int opcao = leiaNum.nextInt();
				return opcao;
			}
			
			public int menuRemoverTemperos() {
				System.out.println("\n|| Você tem certeza que deseja remover todos os temperos do estoque? |");
				System.out.println("|| 1 - Sim");
				System.out.println("|| 2 - Não");
				System.out.println("|| ===============");
				System.out.print("|| Sua escolha: ");
				int opcao = leiaNum.nextInt();
				return opcao;
			}
			
			public int menuRemoverTodos() {
				System.out.println("\n|| Você tem certeza que deseja remover todos os produtos do estoque? |");
				System.out.println("|| 1 - Sim");
				System.out.println("|| 2 - Não");
				System.out.println("|| ===============");
				System.out.print("|| Sua escolha: ");
				int opcao = leiaNum.nextInt();
				return opcao;
			}
			
			public String removerFruta() {
				System.out.print("\n|| Digite o nome da Fruta que deseja remover: ");
				String nome = leiaStr.nextLine();
				return nome;
			}

			public String removerVerdura() {
				System.out.print("\n|| Digite o nome da Verdura que deseja remover: ");
				String nome = leiaStr.nextLine();
				return nome;
			}
			
			public String removerTempero() {
				System.out.print("\n|| Digite o nome do Tempero que deseja remover: ");
				String nome = leiaStr.nextLine();
				return nome;
			}


			public void frutaNaoEncontrado(String nome) {
				System.out.println("\n|| A Fruta "+nome+" não foi encontrada. ||");
			}

			public void verduraNaoEncontrado(String nome) {
				System.out.println("\n|| A verdura "+nome+" não foi encontrada. ||");
			}
			
			public void TemperoNaoEncontrado(String nome) {
				System.out.println("\n|| O tempero "+nome+" não foi encontrado. ||");
			}		
		
			public void frutaRemovida (){
				System.out.println("\n|| Fruta removida com sucesso! ||");
			}

			public void verduraRemovida (){
				System.out.println("\n|| Verdura removida com sucesso! ||");
			}
			
			public void temperoRemovida (){
				System.out.println("\n|| Tempero removido com sucesso! ||");
			}

			public void erro(){
				System.out.println("|| Erro: Opção inválida! ||");
			}
			
			public static void totalProdutos() {
				int totalProdutos = Produto.getTotalProdutos();
				int totalFrutas = Fruta.getTotalFrutas();
				int totalVerduras = Verdura.getTotalVerduras();
				int totalTemperos = Tempero.getTotalTemperos();
				System.out.println("\n||  Até agora temos " + totalProdutos + " produto(s) cadastrado(s). ||");
				System.out.println("|| " + totalFrutas + " são frutas. " + totalVerduras + " são verduras. " + totalTemperos + " são temperos ||");
			}
			public void encerrando() {
				try {
					System.out.print("\n|");
					Thread.sleep(300); 
					System.out.print("|");
					Thread.sleep(300); 
					System.out.print("   S");
					Thread.sleep(300); 
					System.out.print("i");
					Thread.sleep(300);
					System.out.print("s");
					Thread.sleep(300);
					System.out.print("t");
					Thread.sleep(300);
					System.out.print("e");
					Thread.sleep(300);
					System.out.print("m");
					Thread.sleep(300);
					System.out.print("a");
					Thread.sleep(300);
					System.out.print(" E");
					Thread.sleep(300);
					System.out.print("n");
					Thread.sleep(300);
					System.out.print("c");
					Thread.sleep(300);
					System.out.print("e");
					Thread.sleep(300);
					System.out.print("r");
					Thread.sleep(300);
					System.out.print("r");
					Thread.sleep(300);
					System.out.print("a");
					Thread.sleep(300);
					System.out.print("d");
					Thread.sleep(300);
					System.out.print("o");
					Thread.sleep(300);
					System.out.print("!");
					Thread.sleep(300);
					System.out.print("   |");
					Thread.sleep(300);
					System.out.print("|");
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace(); 
				}
			
			
			}	
		
}

	