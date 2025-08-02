package com.hortfrutapp.view;
import java.util.Scanner;
import com.hortfrutapp.model.*;


public class CadastroProdutos {
		Scanner leiaStr = new Scanner (System.in);
		Scanner leiaNum = new Scanner (System.in);

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

			return new Fruta(id, nome, preco, quantidade, peso);
		}
		
		//=========================================================
			
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
			
		//=========================================================
			
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
}
