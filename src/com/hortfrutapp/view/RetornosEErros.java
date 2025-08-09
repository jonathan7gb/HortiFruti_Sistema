package com.hortfrutapp.view;

import com.hortfrutapp.model.Fruta;
import com.hortfrutapp.model.Produto;
import com.hortfrutapp.model.Tempero;
import com.hortfrutapp.model.Verdura;

public class RetornosEErros {

	public void produtoN() {
		System.out.println("\n|| Nenhum Produto cadastrado! ||");
	}
	
	//==================================================================
		
	public void frutaN() {
		System.out.println("|| Nenhuma Fruta cadastrada! ||");
	}

	//==================================================================
				
	public void verduraN() {
		System.out.println("|| Nenhuma Verdura cadastrada! ||");
	}

	//==================================================================
		
	public void temperoN() {
		System.out.println("|| Nenhum Tempero cadastrado! ||");
	}

	//==================================================================
		
	public void frutaNaoEncontrado(String nome) {
		System.out.println("\n|| A Fruta "+nome+" não foi encontrada. ||");
	}

	//==================================================================
		
	public void verduraNaoEncontrado(String nome) {
		System.out.println("\n|| A verdura "+nome+" não foi encontrada. ||");
	}

	//==================================================================
			
	public void temperoNaoEncontrado(String nome) {
		System.out.println("\n|| O tempero "+nome+" não foi encontrado. ||");
	}		
	
	//==================================================================
	
	public void itemNãoEditado(String nome) {
		System.out.println("\n|| O item "+nome+" não foi editado devido a um erro de inserção. ||");
	}		

	//==================================================================
		
	public void frutaRemovida (){
		System.out.println("\n|| Fruta(s) removida(s) com sucesso! ||");
	}

	//==================================================================
		
	public void verduraRemovida (){
		System.out.println("\n|| Verdura(s) removida(s) com sucesso! ||");
	}

	//==================================================================
		
	public void temperoRemovido (){
		System.out.println("\n|| Tempero(s) removido(s) com sucesso! ||");
	}

	//==================================================================
		
	public void produtosRemovido(){
		System.out.println("\n|| Produtos removidos com sucesso! ||");
	}

	//==================================================================
	
	public void frutaEditadaSucesso (){
		System.out.println("\n|| Fruta editada com sucesso! ||");
	}
	
	//==================================================================
	
	public void verduraEditadaSucesso (){
		System.out.println("\n|| Verdura editada com sucesso! ||");
	}
	
	//==================================================================
	
	public void temperoEditadaSucesso (){
		System.out.println("\n|| Tempero editada com sucesso! ||");
	}

	//==================================================================
		
	public void erroOpcaoInvalida(){
		System.out.println("\n|| Erro: Opção inválida! ||");
	}

	//==================================================================

	public void erroDigiteNumero(){
		System.out.println("\n|| Erro: Digite apenas números! ||");
	}
	
	//==================================================================
	
	public static void totalProdutos() {
		int totalProdutos = Produto.getTotalProdutos();
		int totalFrutas = Fruta.getTotalFrutas();
		int totalVerduras = Verdura.getTotalVerduras();
		int totalTemperos = Tempero.getTotalTemperos();
		System.out.println("\n||  Até agora temos " + totalProdutos + " produto(s) cadastrado(s). ||");
		System.out.println("|| " + totalFrutas + " são frutas. " + totalVerduras + " são verduras. " + totalTemperos + " são temperos ||");
	}
}
