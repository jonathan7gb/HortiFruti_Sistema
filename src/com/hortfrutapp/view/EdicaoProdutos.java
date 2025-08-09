package com.hortfrutapp.view;
import java.util.Scanner;

public class EdicaoProdutos {

	Scanner leiaStr = new Scanner (System.in);
	Scanner leiaNum = new Scanner (System.in);

	public String editarFruta() {
		System.out.print("\n|| Digite o nome da Fruta que deseja editar: ");
		String nome = leiaStr.nextLine();
		return nome;
	}
	
	//====================================================================

	public String editarVerdura() {
		System.out.print("\n|| Digite o nome da Verdura que deseja editar: ");
		String nome = leiaStr.nextLine();
		return nome;
	}
	
	//====================================================================
			
	public String editarTempero() {
		System.out.print("\n|| Digite o nome do Tempero que deseja editar: ");
		String nome = leiaStr.nextLine();
		return nome;
	}
	
	//====================================================================
	
	public String novoNome(String nome) {
		System.out.print("\n|| Digite o novo nome do produto (" + nome + "): ");
		String nomeItem = leiaStr.nextLine();
		return nomeItem;
	}
	
	//====================================================================
	
	public double novoPreco(String nome) {
		System.out.print("\n|| Digite o novo preço do produto (" + nome + "): ");
		double precoItem = leiaNum.nextDouble();
		return precoItem;
	}
	
	//====================================================================
	
	public int novaQuantidade(String nome) {
		System.out.print("\n|| Digite a nova quantidade do produto (" + nome + "): ");
		int quantidadeItem = leiaNum.nextInt();
		return quantidadeItem;
	}
	
	//====================================================================
	
	public double novoPeso(String nome) {
		System.out.print("\n|| Digite o novo peso do produto (" + nome + "): ");
		double pesoItem = leiaNum.nextDouble();
		return pesoItem;
	}
	
	//====================================================================
	
	public String novoTipo(String nome) {
		System.out.print("\n|| Digite o novo nome do produto (" + nome + "): ");
		String tipoItem = leiaStr.nextLine();
		return tipoItem;
	}
}
